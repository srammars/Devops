pipeline {
    agent any

    environment {
        MVN_HOME = tool 'maven-3.5.2'
    }

    stages {
        stage('Clone repo') {
            steps {
                checkout scm
            }
        }

        stage('Build project') {
            steps {
                dir('demo') {
                    script {
                        sh "${MVN_HOME}/bin/mvn -B clean package"
                    }
                }
            }
        }

        stage('Run Tests') {
            steps {
                dir('demo') {
                    script {
                        sh "${MVN_HOME}/bin/mvn test"
                    }
                }
            }
        }

        stage('Archive Javadoc and Test Results') {
            steps {
                dir('demo') {
                    script {
                        sh "${MVN_HOME}/bin/mvn javadoc:javadoc"
                        archiveArtifacts artifacts: ['target/site/apidocs/**/*', 'target/surefire-reports/**/*.xml'], allowEmptyArchive: true
                    }
                }
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
