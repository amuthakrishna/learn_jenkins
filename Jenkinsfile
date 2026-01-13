pipeline {
    agent any
    stages {
        stage("Image Build") {
           steps {
               script {
                   withDockerRegistry(credentialsId: 'docker-hub-credentials', url: 'https://hub.docker.com/') {
                        sh 'docker build -t krishnamoorthy1/demo-app:v5 .'
                    }
               }
           }
        }

        stage("Image Push") {
           steps {
               script {
                   withDockerRegistry(credentialsId: 'docker-hub-credentials', url: 'https://hub.docker.com/') {
                        sh 'docker image push krishnamoorthy1/demo-app:v5 .'
                    }
               }
           }
        }
    }
    
}
