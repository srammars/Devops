pipeline {
    agent any

    environment {
        MVN_HOME = tool 'maven-3.5.2' // Assurez-vous que le nom ici correspond à celui configuré dans Jenkins
    }
    stages {
        stage('Clone repo') {
            steps {
                checkout scm
            }
        }
        stage('Build and Test') {
            steps {
                dir('./demo') {
                    script {
                        sh "${MVN_HOME}/bin/mvn clean test"
                    }
                }
            }
        }

        stage('Build project') {
            steps {
                dir('./demo') {
                    script {
                        sh "${MVN_HOME}/bin/mvn -B -DskipTests clean package"
                    }
                }
            }
        }

        stage('Generate Javadoc') {
            steps {
                dir('./demo') {
                    script {
                        sh "${MVN_HOME}/bin/mvn javadoc:javadoc"
                        sh 'ls -l target/site'
                    }
                }
            }
        }

        stage('Archive Javadoc') {
            steps {
                archiveArtifacts artifacts: 'demo/target/site/apidocs/**/*', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if the build is successful'
        }
        failure {
            echo 'This will run only if the build fails'
        }
    }
}
