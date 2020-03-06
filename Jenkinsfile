pipeline {
  agent any
  stages {
    stage('Clean') {
      steps {
        sh 'mvn -s .m2/settings.xml --batch-mode -Dsettings.security=.m2/settings-security.xml -DuniqueVersion=false clean'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn -s .m2/settings.xml --batch-mode -Dsettings.security=.m2/settings-security.xml -DuniqueVersion=false compile package'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn -s .m2/settings.xml --batch-mode -Dsettings.security=.m2/settings-security.xml -DuniqueVersion=false test'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts 'target/*.jar'
      }
    }

  }
}