pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        git(url: 'https://github.com/nicorickert/ids-fund-del-swebok-tp-testing', branch: 'master')
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

    stage('Coverage') {
      steps {
        echo 'Generating coverage report'
        withGradle() {
          sh './gradlew -i test jacocoTestReport'
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