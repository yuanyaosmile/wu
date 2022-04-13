def NAME

pipeline {
    agent any
    environment {
        jobName = "${env.JOB_NAME}"
        NAME = jobName =~ "^(.+?/)"

    }
    stages {
        stage('Build') {
            steps {
                script {
                     sh 'echo "start"'
                     
                     echo jobName
                     echo NAME
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
