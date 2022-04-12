pipeline {
    agent any
   /*  environment {
        CI = 'true'
    } */
    stages {
        stage('Build') {
            steps {
                script {
                     sh 'echo "start"'
                     jobName = "${env.JOB_NAME}"
                     sh 'echo "${env.JOB_NAME}"'
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
