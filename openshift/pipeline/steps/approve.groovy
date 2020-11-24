def execute(Map args) {
    def application = args.application
    def approvalGates = args.approvalGates
    def environment = args.environment
    def version = args.version

    for (approvalGate in approvalGates.tokenize(',')) {
        if (approvalGate == environment) {
            timeout(time: 30, unit: 'DAYS') {
                echo "Awaiting approval before promoting ${application} version ${version} to ${environment}."
                input message: "Promote ${application} version ${version} to ${environment}?"
            }
        }
    }
    echo "Promoting ${application} version ${version} to ${environment}."
}

return this
