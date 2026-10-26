pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
             git branch: 'main', url: 'https://github.com/ankurkhurpadi/devops-18-jenkins.git'
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