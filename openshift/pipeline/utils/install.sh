#!/usr/bin/env bash

# $1 = GitLab Group
# $2 = GitLab Project
# $3 = GitLab Branch

set -e

# clone the project
git clone git@gitlab.ros.gov.uk:$1/$2.git
cd $2

# checkout the correct branch
git checkout $3 || git checkout -b $3 && git push --set-upstream origin $3

# uninstall the pipeline from GitLab if present
git rm -r openshift/pipeline || true
git commit -am "Deleting pipeline." || true

# install the pipeline into GitLab
git subtree add -P openshift/pipeline --squash git@gitlab.ros.gov.uk:ocp/pipeline-spring-boot-gradle.git master

# push changes
git push

# tidy up
cd ..
rm -rf $2
