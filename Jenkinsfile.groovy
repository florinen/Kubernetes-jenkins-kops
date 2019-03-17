node {
    properties([pipelineTriggers([cron('H * * * *')])])
    stage ("Terraform init"){
        sh "terraform init"
    }
    stage("terraform apply"){
        sh "terraform  plan"
}
}
