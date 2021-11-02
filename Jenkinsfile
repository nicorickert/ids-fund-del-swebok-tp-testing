pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        git(url: 'https://github.com/nicorickert/ids-fund-del-swebok-tp-scm', branch: 'master')
        withGradle() {
          sh './gradlew build'
          sh './gradlew bootRun'
        }

      }
    }

    stage('Test') {
      steps {
        echo 'Testing'
        withGradle() {
          sh './gradlew test'
        }

      }
    }

    stage('Validate') {
      steps {
        echo 'Validating'
      }
    }

    stage('Analyze') {
      steps {
        echo 'Analyzing'
        withGradle() {
          sh 'Dsonar.host.url=localhost:9000'
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying'
      }
    }

  }
}