def buildApp {
  echo 'building appliation'
}

def testApp {
  echo 'Testing appliation'
}

def deployApp {
  echo 'Deploy appliation'
  echo "Deploy version: ${params.VERSION}"
}

return this
