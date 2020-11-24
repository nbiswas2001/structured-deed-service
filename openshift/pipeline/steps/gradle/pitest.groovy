def execute(Map args) {
    if (!fileExists('gradlew')) {
        echo "No gradlew file detected. Skipping pitest stage."
        return
    }
    try {
        def extraArgs = env.EXTRA_ARGS_PITEST ?: ''
        def extraEnvVars = env.EXTRA_ENV_VARS_PITEST ?: ''
        sh "${extraEnvVars} ./gradlew pitest -PBUILD_VERSION=${args.version} ${extraArgs}"
    } finally {
        if (fileExists('build/reports/pitest')) {
            archiveArtifacts artifacts: 'build/reports/pitest/**'
        }
    }
}

return this
