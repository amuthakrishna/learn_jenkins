pipeline {
    agent any

    stages {
        stage('Docker Build') {
            steps {
                sh '''
                TAG=$(date +"%Y%m%d-%H%M%S")
                docker build -t nginx:${TAG} .
                '''
            }
        }
    }
}
