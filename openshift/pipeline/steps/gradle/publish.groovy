def execute(Map args) {
    if (!fileExists('gradlew')) {
        echo "No gradlew file detected. Skipping publish stage."
        return
    }
    sh "./gradlew publish -PBUILD_VERSION=${args.version}"
}

return this
