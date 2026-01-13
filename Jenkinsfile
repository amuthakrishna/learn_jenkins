pipeline {
    agent any

    stages {
        stage('Docker BUild') {
            steps {
                sh 'docker build -t nginx:v1 .'
            }
        }
    }
}
