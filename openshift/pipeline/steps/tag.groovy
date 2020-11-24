def execute(Map args) {
    def identifier = readFile('openshift/pipeline/image-identifier')
    sh "oc tag ${args.application}@${identifier} ${args.application}:${args.version}"
}

return this
