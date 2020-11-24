def execute(Map args) {
    currentBuild.displayName = args.version

    sh 'git rev-parse --long HEAD > openshift/pipeline/rev-long'
    sh 'git rev-parse --short HEAD > openshift/pipeline/rev-short'

    // TODO: move this into the maven template
    sh 'mkdir -p ~/.gradle'
    sh 'echo "org.gradle.daemon=false" >> ~/.gradle/gradle.properties'
}

return this
