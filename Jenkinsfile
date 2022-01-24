pipeline {
    agent any
    environment {
        CI = 'true'
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "hello"'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "end"'
            }
        }
    }
}