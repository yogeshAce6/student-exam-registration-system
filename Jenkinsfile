pipeline {
    agent any

    tools {
        maven 'Maven' // Ensure Maven is configured in Jenkins Global Tool Configuration
        jdk 'JDK'     // Ensure JDK is configured in Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/yogeshAce6/student-exam-registration-system/blob/main/Jenkinsfile'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Student Exam Registration System deployed successfully'
            }
        }
    }
}
