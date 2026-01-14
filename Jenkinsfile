pipeline {
    agent any
    stages {
        stage("Build Push Image") {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                        sh 'docker build -t krishnamoorthy1/demo-app:v45 .'
                        echo $PASSWORD | docker login -u $USERNAME --password-stdin
                        sh 'docker push krishnamoorthy1/demo-app:v45'
                    }
                }
            }
        }
    }
}
