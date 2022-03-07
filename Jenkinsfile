pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        tool(name: 'MAVEN_LOCAL', type: 'maven')
        sh 'echo $MAVEN_LOCAL'
      }
    }

  }
}