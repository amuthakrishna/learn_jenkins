pipeline {
    agent any

    parameters {
        choice(
            name: 'VERSION',
            choices: ['1.1.0', '1.1.1'],
            description: 'Application version'
        )
        booleanParam(
            name: 'executeTest',
            defaultValue: true,
            description: 'Execute test stage'
        )
    }

    stages {
        stage("Build") {
            steps {
                echo 'Building application'
            }
        }

        stage("Test") {
            when {
                expression {
                    params.executeTest == true
                }
            }
            steps {
                echo 'Running tests'
            }
        }

        stage("Deploy") {
            steps {
                echo 'Deploying application'
                echo "Deploy version: ${params.VERSION}"
            }
        }
    }
}
