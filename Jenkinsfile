stage('Build') {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '4ab982b7-42cb-47b9-adf1-eea8523fa3d5', url: 'https://github.com/Jooones/devopscourse-jenkins']]])
    sh './gradlew build'
}
stage('Test') {
    sh './gradlew test'
}
