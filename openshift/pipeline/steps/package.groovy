def execute(Map args) {
    def application = args.application
    def project = args.project
    def version = args.version

    sh 'mkdir -p openshift/s2i'
    dir('openshift/s2i') {
        try {
            unstash 'libs'
        }
        catch (e) {
            echo "Failed to unstash 'libs'. Stash may not exist."
        }
    }

    if (fileExists('openshift/pipeline-ext/config/common/build.properties')) {
        echo "Detected custom build properties."
        sh 'awk -F= \'!a[$1]++\' ' +
            'openshift/pipeline-ext/config/common/build.properties ' +
            'openshift/pipeline/config/common/build.properties ' +
            '> build.properties'
    } else {
        sh 'cp openshift/pipeline/config/common/build.properties build.properties'
    }

    def strategy = fileExists('openshift/s2i/Dockerfile') ? 'Docker' : 'Source'
    sh "oc process -f openshift/pipeline/templates/${strategy}BuildConfig.yml " +
        "-p APPLICATION=${application} -p PROJECT=${project} -p VERSION=${version} " +
        "--param-file=build.properties " +
        "> BuildConfig.json"
    sh "oc apply --force -f BuildConfig.json"
    sh "oc start-build ${application} --from-dir=openshift/s2i --follow=true --wait=true"
    sh "oc get istag ${application}:latest --template={{.image.metadata.name}} > openshift/pipeline/image-identifier"
}

return this
