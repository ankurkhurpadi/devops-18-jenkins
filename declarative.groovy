pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
              git branch: 'main' , url: 'git branch: 'main', url: 'https://github.com/iamtruptimane/ChatBot-Deployment.git''
                
            }
        }
        stage('Build') {
            steps {
              echo 'building...'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}