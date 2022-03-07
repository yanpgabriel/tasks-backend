pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        tool(name: 'MAVEN_LOCAL', type: 'maven')
        sh 'mvn clean package'
      }
    }

  }
}