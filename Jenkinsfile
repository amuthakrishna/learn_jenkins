def gv
pipeline {
    agent any

    stages {
        stage("init") {
            steps {
                script {
                    gv = load "groovy.script"
                }
            }
        }
        
        stage("Build & Push Image") {
            steps {
                script {
                       gv.buildapp() 
                    }
                }
            }
        }
    }
}
