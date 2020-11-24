#!/usr/bin/env bash

# $1 = Project
# $2 = Application
# $3 = Version

oc delete istag $2:$3 -n $1-ci-cd
oc delete istag $2:$3 -n $1-dev
oc delete istag $2:$3 -n $1-test
oc delete istag $2:$3 -n $1-stage
oc delete istag $2:$3 -n $1-prod
