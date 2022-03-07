pipeline {
  agent any
  tools {
    maven 'MAVEN_LOCAL'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -Dquarkus.package.type=uber-jar -DskipTests'
        archiveArtifacts artifacts: 'target/tasks-*-runner.jar', followSymlinks: false
        cleanWs()
      }
    }
    stage('Deploy') {
      steps{
        sh 'docker-compose up -d'
      }
    }
  }
}
