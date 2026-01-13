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
        stage("init") {
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
                expression {
                    params.executeTest == true
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage("Deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
