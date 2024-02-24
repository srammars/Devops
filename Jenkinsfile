pipeline {
    agent any

    tools {
        maven 'maven-3.5.2'
    }

    stages {
        stage('Clone repo') {
            steps {
                checkout scm
            }
        }

        stage('Build project and Run Tests') {
            steps {
                dir('demo') {
                    script {
                        sh "${tool 'maven-3.5.2'}/bin/mvn clean test"
                    }
                }
            }
        }

        stage('Publish Javadoc and Test Results') {
            steps {
                dir('demo') {
                    script {
                        sh "${tool 'maven-3.5.2'}/bin/mvn javadoc:javadoc"
                        junit 'target/surefire-reports/*.xml'
                    }
                }
            }
        }
    }
}
