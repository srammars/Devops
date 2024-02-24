pipeline {
    agent any

    tools {
        // Define the Maven tool
        maven 'maven-3.5.2'
    }

    stages {
        stage('Clone repo') {
            steps {
                // Clone the repository with the specified branch
                git branch: 'devops', url: 'https://github.com/srammars/Devops.git'
            }
        }

        stage('Build project') {
            steps {
                dir('demo') {
                    // Build the project, skipping tests
                    sh "'${tool 'maven-3.5.2'}/bin/mvn' -B -DskipTests clean package"

                    // Generate Javadoc
                    sh "'${tool 'maven-3.5.2'}/bin/mvn' javadoc:javadoc"
                }
            }
        }

        stage('Publish Javadoc') {
            steps {
                // Publish Javadoc reports
                publishHTML(
                    target: [
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: true,
                        reportDir: 'demo/target/site/apidocs',
                        reportFiles: 'index.html',
                        reportName: 'Javadoc Report',
                        reportTitles: ''
                    ]
                )
            }
        }
    }
}
