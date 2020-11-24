# OpenShift Pipeline

This project aims to provide a generic and reusable pipeline which can be used to deploy applications to OpenShift. The
defaults assume a Spring Boot application using Gradle as its build tool, but extension points are available which allow
other technologies and build tools to be used instead.

## Installing

Installing the pipeline into your project can be done as shown below:

```
git subtree add -P openshift/pipeline --squash git@gitlab.ros.gov.uk:ocp/pipeline-spring-boot-gradle.git master
git push
```

Once you have the pipeline in your project you must next add the pipeline to OpenShift as shown below:

```
oc login
oc project myproject-ci-cd
oc process -f openshift/pipeline/templates/JenkinsPipeline.yml -p APPLICATION=my-application -p GIT_URL=https://gitlab.ros.gov.uk/my/project.git -p PROJECT=myproject | oc apply -f -
```

Alternatively you can use the 'Import YAML / JSON' feature in the OpenShift console.

Once installed, the first invocation of your pipeline must be manually triggered. Thereafter it will run automatically in
response to changes pushed to your project.

## Updating

Changes made to the pipeline in the external repository will not be automatically reflected in your project. Updating is
a conscious choice on the part of the consumer. Updating the pipeline can be done as shown below:

```
git subtree pull -P openshift/pipeline --squash -m "Updating pipeline." git@gitlab.ros.gov.uk:ocp/pipeline-spring-boot-gradle.git master
git push
```

Note: the above will not work if you have added the subtree on a branch which you have then squashed upon merging to master.

If you want to completely replace the pipeline:

```
git rm -r openshift/pipeline
git commit -am "Deleting pipeline."
git subtree add -P openshift/pipeline --squash git@gitlab.ros.gov.uk:ocp/pipeline-spring-boot-gradle.git master
git push
```

Note that if you have made changes in your local subtree which conflict then you will need to resolve these manually.

## Contributing

Changes made to the pipeline in your project will not be automatically reflected in external repository. Contributing is
a conscious choice on the part of the consumer. Contributing changes to the pipeline can be done as shown below:

```
git subtree push -P openshift/pipeline git@gitlab.ros.gov.uk:ocp/pipeline-spring-boot-gradle.git my-contribution
```

Then open https://gitlab.ros.gov.uk/ocp/pipeline-spring-boot-gradle/merge_requests/new?merge_request%5Bsource_branch%5D=my-contribution
in your browser and submit a merge request with your changes.

## Extension Points

To see the configurable parameters provided by the pipeline template run the following command:

```
oc process -f openshift/pipeline/templates/JenkinsPipeline.yml --parameters
```

To see the configurable parameters provided by the application template installed by the pipeline run the following command:

```
oc process -f openshift/pipeline/templates/Application.yml --parameters
```

These can be configured by adding the following files to your environment:

* openshift/pipeline-ext/config/common/application.properties
* openshift/pipeline-ext/config/dev/application.properties
* openshift/pipeline-ext/config/test/application.properties
* openshift/pipeline-ext/config/stage/application.properties
* openshift/pipeline-ext/config/prod/application.properties

You can also provide a config map for each environment, the contents of which will be set as environment variables for
the running application, by adding the following files to your environment:

* openshift/pipeline-ext/config/dev/ConfigMap.yml
* openshift/pipeline-ext/config/test/ConfigMap.yml
* openshift/pipeline-ext/config/stage/ConfigMap.yml
* openshift/pipeline-ext/config/prod/ConfigMap.yml

If you need to customise further you can provide your own templates by adding the following files to your project:

* openshift/pipeline-ext/templates/Application.yml
* openshift/pipeline-ext/templates/BuildConfig.yml

You can also customise the implementation of the various pipeline stages by adding the following files to your project:

* openshift/pipeline-ext/steps/accept.groovy
* openshift/pipeline-ext/steps/approve.groovy
* openshift/pipeline-ext/steps/build.groovy
* openshift/pipeline-ext/steps/deploy.groovy
* openshift/pipeline-ext/steps/mutate.groovy
* openshift/pipeline-ext/steps/package.groovy
* openshift/pipeline-ext/steps/prepare.groovy
* openshift/pipeline-ext/steps/promote.groovy
* openshift/pipeline-ext/steps/publish.groovy

## Prerequisites

### Artifactory over SSL

All access to artifactory.ros.gov.uk must use https. This is because port 80 is not accessible from OpenShift.

This requires you to download the gradle wrapper from the following url:

```
distributionUrl=https\://artifactory.ros.gov.uk/artifactory/repo/uk/gov/ros/itservices/ros-gradle/4.1-ssl/ros-gradle-4.1-ssl.zip
```

All build.gradle files also need to be updated to use https as shown below:

```
buildscript {
    repositories {
        maven { url 'https://artifactory.ros.gov.uk/artifactory/repo' }
    }
    dependencies {
        ...
    }
}
```

## Secrets

The deployment config setup by this pipeline will optionally mount secrets if they are present in the project which is
being deployed to. You can create secrets in the OpenShift console using the "Add to Project" option and pasteing in the
yml below:

```
apiVersion: v1
data:
  MY_FIRST_SECRET: TVlfRklSU1RfU0VDUkVU
  MY_SECOND_SECRET: MY_SECOND_SECRET
kind: Secret
metadata:
  name:shared
type: Opaque
```

If the secret file is given the name of 'shared' then the secrets will be available to all deployments. To create secrets
specific to only a single deployment, simply give the secret a name which matches the deployment. Any number of secrets can
be provided. Values should be base64 encoded. Secrets are made available as environment variables inside the containers.

## Versioning

The default version number used by the pipeline is 1.0.BUILD_NUMBER, where BUILD_NUMBER is the Jenkins build number which
increments on every build. You can customise this by passing environment variables to the pipeline. Pass MAJOR_VERSION to
change the first digit and MINOR_VERSION to change the second digit.

## Routes

By default a route is created in each environment. In dev/test these routes will be open and accessible. However this may
not be desirable in stage/prod so the defaults configuration will lock the routes down unless the inbound traffic is from
OpenShift itself. This permits things like health checking and automated testing but precludes unwanted external access to
your services.

To allow access to your routes (e.g. for a web application), add the following configuration to the application.properties
file for stage/prod:

```
ROUTER_IP_WHITELIST=0.0.0.0/0
```

Alternatively if you want to completely lock down your route:

```
ROUTER_IP_WHITELIST=255.255.255.255
```

## Gotchas

* If you change the pod template defined in the Jenkinsfile then you will need to manually delete the configuration via
'Manage Jenkins' - 'Configure System' before the changes will take effect.

## Example Usages

This pipeline has been used for a variety of different components. Below are some examples:

### Consuming a Spring Boot JAR file built by another team

https://gitlab.ros.gov.uk/scotlis/registered-title-service-pipeline

This project downloads a specified version of the Registered Title Service from
Artifactory, builds an image and deployes it to the ScotLIS environments.

### Consuming an image from another OpenShift project

https://gitlab.ros.gov.uk/scotlis/locate-pipeline

This project creates a dedicated RoS Locate deployment in the ScotLIS environments.

### Building a JavaScript application

https://gitlab.ros.gov.uk/scotlis/webapp

This project demonstrates how the pipeline can be adapted to build and deploy a
JavaScript web applicatoin.

### Building a simple NGINX server

https://gitlab.ros.gov.uk/scotlis/edge

This project demonstrates how the pipeline can be adapted to build and deploy a
custom NGINX server.
