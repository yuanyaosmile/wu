def NAME

pipeline {
    agent any
    environment {
        jobName = "${env.JOB_NAME}"

    }
    stages {
        stage('Build') {
            steps {
                script {
                     sh 'echo "start"'
                     
                     echo jobName
                     echo jobName =~ "^(.+?/)"
                }
                
            }
        }
        stage('Test') {
            steps {
                sh 'echo "end"'
            }
        }
    }
}
