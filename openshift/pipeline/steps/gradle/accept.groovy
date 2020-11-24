def execute(Map args) {
    if (!fileExists('gradlew')) {
        echo "No gradlew file detected. Skipping accept stage."
        return
    }
    try {
        def extraArgs = env.EXTRA_ARGS_ACCEPT ?: ''
        def extraEnvVars = env.EXTRA_ENV_VARS_ACCEPT ?: ''
        sh "${extraEnvVars} ./gradlew acceptanceTest -PBUILD_VERSION=${args.version} ${extraArgs}"
    } finally {
        if (fileExists('build/reports/acceptanceTests')) {
            archiveArtifacts artifacts: 'build/reports/acceptanceTests/**'
        }
    }
}

return this
