pipeline {
  agent any
  stages {
    stage('Build') {
      agent {
        docker {
          image 'maven'
        }

      }
      steps {
        sh 'mvn clean package -Dquarkus.package.type=uber-jar -DskipTests'
        archiveArtifacts 'target/tasks-*-runner.jar'
        cleanWs()
      }
    }

  }
  tools {
    maven 'MAVEN_LOCAL'
  }
}