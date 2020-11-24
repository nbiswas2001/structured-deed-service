#!/usr/bin/env bash

# $1 = GitLab Group
# $2 = GitLab Project
# $3 = GitLab Branch

set -e

# clone the project
git clone git@gitlab.ros.gov.uk:$1/$2.git
cd $2

# checkout the correct branch
git checkout $3

# update the pipeline in GitLab
git subtree pull -P openshift/pipeline --squash -m "Updating pipeline." git@gitlab.ros.gov.uk:ocp/pipeline-spring-boot-gradle.git master
git push

# tidy up
cd ..
rm -rf $2
