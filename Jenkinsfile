node() {
    stage('Build') {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '4ab982b7-42cb-47b9-adf1-eea8523fa3d5', url: 'https://github.com/Jooones/devopscourse-jenkins']]])
        sh './gradlew build -Dorg.gradle.java.home=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.151-1.b12.el7_4.x86_64'
    }
    stage('Test') {
        sh './gradlew test -Dorg.gradle.java.home=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.151-1.b12.el7_4.x86_64'
    }
}