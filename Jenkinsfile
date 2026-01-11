pipeline {
    agent any

    stages {
        stage("Show credentials") {
            steps {
                echo "application is running"

                withCredentials([
                    usernamePassword(
                        credentialsId: 'docker-hub-credentials',
                        usernameVariable: 'USER',
                        passwordVariable: 'PWD'
                    )
                ]) {
                    sh 'echo "User is $USER"'
                    // NEVER echo password in real pipelines
                }
            }
        }
    }
}
