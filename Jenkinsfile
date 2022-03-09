pipeline {
  agent any
  tools {
    maven 'MAVEN_LOCAL'
  }
  stages {
    stage('Deploy') {
      steps{
        sh 'ls -la'
        sh 'docker-compose up -d'
      }
    }
  }
}
