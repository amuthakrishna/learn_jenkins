pipeline {
    agent any

    stages {
        stage('Git CheckOut') {
            steps {
                withCredentials([gitUsernamePassword(credentialsId: 'GIt-Credentials', gitToolName: 'Default')]) {
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t krishnamoorthy-nginx:v1 .'
                }
            }
        }
    }
}
