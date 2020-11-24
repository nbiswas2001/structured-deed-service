def execute(Map args) {
    def application = args.application
    def cluster = args.cluster
    def environment = args.environment
    def project = args.project
    def version = args.version

    milestone label: "deploying to ${environment}"

    if (fileExists('openshift/pipeline-ext/config/common/application.properties')) {
        echo "Detected custom application properties."
        sh 'cat openshift/pipeline-ext/config/common/application.properties >> openshift/pipeline/config/common/application.properties'
    }

    if (fileExists("openshift/pipeline-ext/config/${environment}/application.properties")) {
        echo "Detected custom application properties for ${environment} environment."
        sh "cat openshift/pipeline-ext/config/${environment}/application.properties >> openshift/pipeline/config/${environment}/application.properties"
    }

    if (fileExists('openshift/pipeline-ext/templates/Application.yml')) {
        echo 'Detected custom Application.yml template.'
        sh 'cp openshift/pipeline-ext/templates/Application.yml openshift/pipeline/templates'
    }

    def namespace = "${project}-${environment}".toString()

    if (env.CLEAN_BEFORE_DEPLOY == "true") {
        sh "oc delete all -l app=${application} -n ${namespace}"
    }
    
    if (fileExists("openshift/pipeline-ext/config/${environment}/Config.yml")) {
        echo "Detected custom config for ${environment} environment."
        sh "oc apply --force -f openshift/pipeline-ext/config/${environment}/Config.yml -n ${namespace}"
    }

    if (fileExists("openshift/pipeline-ext/config/${environment}/ConfigMap.yml")) {
        echo "Detected custom config map for ${environment} environment."
        sh "oc apply --force -f openshift/pipeline-ext/config/${environment}/ConfigMap.yml -n ${namespace}"
    }

    def identifier = readFile('openshift/pipeline/image-identifier')
    sh "oc tag ${application}@${identifier} ${application}:${environment}"
    sh "oc tag ${application}@${identifier} ${namespace}/${application}:${environment}"

    sh "oc process -f openshift/pipeline/templates/Application.yml " +
        "-p APPLICATION=${application} -p CLUSTER=${cluster} -p ENVIRONMENT=${environment} -p PROJECT=${project} -p IDENTIFIER=${identifier} " +
        "--param-file=openshift/pipeline/config/common/application.properties " +
        "--param-file=openshift/pipeline/config/${environment}/application.properties " +
        "> Application.json"
    sh "oc apply --force -f Application.json -n ${namespace}"

    if (fileExists("openshift/pipeline-ext/patches/common/DeploymentConfig.yml")) {
        echo 'Detected DeploymentConfig.yml patch file.'
        sh "oc patch dc/${application} -p \"\$(cat openshift/pipeline-ext/patches/common/DeploymentConfig.yml)\""
    }

    if (fileExists("openshift/pipeline-ext/patches/common/Route.yml")) {
        echo 'Detected Route.yml patch file.'
        sh "oc patch route/${application} -p \"\$(cat openshift/pipeline-ext/patches/common/Route.yml)\""
    }

    if (fileExists("openshift/pipeline-ext/patches/common/Service.yml")) {
        echo 'Detected Service.yml patch file.'
        sh "oc patch svc/${application} -p \"\$(cat openshift/pipeline-ext/patches/common/Service.yml)\""
    }

    waitUntil {
        try {
            openshiftDeploy(
                deploymentConfig: application,
                namespace: namespace,
                verbose: env.VERBOSE_DEPLOYMENT_LOGS ?: false)
            openshiftVerifyDeployment(
                deploymentConfig: application,
                namespace: namespace,
                verifyReplicaCount: true,
                verbose: env.VERBOSE_DEPLOYMENT_LOGS ?: false)
            return true
        } catch (ignored) {
            timeout(time: 30, unit: 'DAYS') {
                echo "Awaiting approval before retrying promotion of ${application} version ${version} to ${environment}."
                input message: "Retry promotion of ${application} version ${version} to ${environment}?"
                return false
            }
        }
    }
}

return this
