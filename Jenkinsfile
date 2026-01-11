pipeline {
  agent any
  environment {
    
  }
  stages {
    stage("Show credentails") {
      steps {
        echo "application is running"
        withCredentials([
        usernamePassword(credentails:'docker-hub-credentials', usernamevariable: USER, passwordvariable PWD)
      ]) {
          sh "some ${USER} ${PWD}"
      }
    }
  }

}

