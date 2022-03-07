pipeline {
  agent any
  tools {
    maven 'MAVEN_LOCAL'
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -Dquarkus.package.type=uber-jar -DskipTests'
      }
    }

  }
}
