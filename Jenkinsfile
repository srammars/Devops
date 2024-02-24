pipeline {
    agent any

    tools {
        maven 'maven-3.5.2'
    }

    stages {
        stage('Clone repo') {
            steps {
                // Notez le changement de répertoire
                dir('C:/Users/sramm/OneDrive/Documents/Devops/demo') {
                    checkout scm
                }
            }
        }

        stage('Build project and Run Tests') {
            steps {
                // Notez le changement de répertoire
                dir('C:/Users/sramm/OneDrive/Documents/Devops/demo') {
                    script {
                        sh "'${MVN_HOME}/bin/mvn' clean test"
                    }
                }
            }
        }

        stage('Publish Javadoc and Test Results') {
            steps {
                // Notez le changement de répertoire
                dir('C:/Users/sramm/OneDrive/Documents/Devops/demo') {
                    script {
                        sh "'${MVN_HOME}/bin/mvn' javadoc:javadoc"
                        junit 'target/surefire-reports/*.xml'
                    }
                }
            }
        }
    }
}
