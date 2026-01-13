def gv

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
        stage("Init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        
        stage("Build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }

        stage("Test") {
            when {
                expression { params.executeTest }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage("Deploy") {
            input{
                message "Select the environment to deploy"
                ok "Done"
                parameters{
                            choice(
            name: 'ENV',
            choices: ['dev', 'stage'],
            description: 'Application version'
        )
                    
                }
            }
            steps {
                script {
                    gv.deployApp()
                    echo "Deploy to ${ENV}
                }
            }
        }
    }
}
