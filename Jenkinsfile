pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choice: ['1.0', '1.1'], description: '')
        booleanParam(name: 'executeTest', defaultValue: true, description: '')
    }

    stages {
        stage("Build") {
            steps {
                echo 'building application'
            }
            
        }
        stage("Test") {
            steps {
                echo 'building application'
                when {
                    expression {
                        params.executeTest == true
                    }
                }
            }
            
        }
        stage("deploy") {
            steps {
                echo 'building application'
                echo "deploy ${params.VERSION}"
            }
            
        }
    }
}
