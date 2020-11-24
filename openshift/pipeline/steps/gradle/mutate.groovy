def execute(Map args) {
    if (!fileExists('gradlew')) {
        echo "No gradlew file detected. Skipping mutate stage."
        return
    }
    try {
        def extraArgs = env.EXTRA_ARGS_MUTATE ?: ''
        def extraEnvVars = env.EXTRA_ENV_VARS_MUTATE ?: ''
        sh "${extraEnvVars} ./gradlew mutationTest -PBUILD_VERSION=${args.version} ${extraArgs}"
    } finally {
        if (fileExists('build/reports/mutationTests')) {
            archiveArtifacts artifacts: 'build/reports/mutationTests/**'
        }
    }
}

return this
