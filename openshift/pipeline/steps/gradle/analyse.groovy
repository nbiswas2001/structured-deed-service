def execute(Map args) {
    if (!fileExists('gradlew')) {
        echo "No gradlew file detected. Skipping analyse stage."
        return
    }
    def sonarHostUrl = env.SONAR_HOST_URL ?: 'http://sonarqube:9000'
    sh "./gradlew sonarqube -PBUILD_VERSION=${args.version} -Dsonar.host.url=${sonarHostUrl}"
}

return this
