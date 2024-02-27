pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                script {
                    // Configuration Maven
                    def mvnHome = tool 'Maven'
                    sh "${mvnHome}/bin/mvn clean test"
                }
            }
        }
    }

    post {
        always {
            // Archiver les résultats des tests
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
