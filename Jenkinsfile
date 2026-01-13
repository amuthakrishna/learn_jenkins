pipeline {
    agent any
    stages {
        stage("Image Build") {
           steps {
               script {
                   withDockerRegistry(credentialsId: 'docker-hub-credentials') {
                        sh 'docker build -t krishnamoorthy1/demo-app:v5 .'
                    }
               }
           }
        }

        stage("Image Push") {
           steps {
               script {
                   withDockerRegistry(credentialsId: 'docker-hub-credentials') {
                        sh 'docker image push krishnamoorthy1/demo-app:v5'
                    }
               }
           }
        }
    }
    
}
