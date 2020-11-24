def execute(Map args) {
    if (!fileExists('gradlew')) {
        echo "No gradlew file detected. Skipping build stage."
        return
    }
    try {
        def extraArgs = env.EXTRA_ARGS_BUILD ?: ''
        def extraEnvVars = env.EXTRA_ENV_VARS_BUILD ?: ''
        sh "${extraEnvVars} ./gradlew clean build -PBUILD_VERSION=${args.version} ${extraArgs}"
        dir('build/libs') {
            stash name: 'libs', includes: '*.jar, *.tar, *.war'
        }
    }
    finally {
        junit testResults: 'build/test-results/test/*.xml'
    }
}

return this
