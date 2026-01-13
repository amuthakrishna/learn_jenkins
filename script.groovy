def buildApp() {
    echo 'Building application'
}

def testApp() {
    echo 'Testing application'
}

def deployApp() {
    echo 'Deploy application'
    echo "Deploy version: ${params.VERSION}"
}

return this
