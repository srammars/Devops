pipeline {
    agent any
    
    environment {
        MVN_HOME = tool 'maven-3.5.2'
    }

    stages {
        stage('Clone and Build') {
            steps {
                script {
                    git branch: 'devops', url: 'https://github.com/srammars/Devops.git'
                    dir('demo') {
                        sh "${MVN_HOME}/bin/mvn -B -DskipTests clean package"
                    }
                }
            }
        }

        stage('Generate Javadoc') {
            steps {
                script {
                    dir('demo') {
                        sh "${MVN_HOME}/bin/mvn javadoc:javadoc"
                    }
                }
            }
        }

        stage('Publish Javadoc') {
            steps {
                script {
                    dir('demo/target/site') {
                        publishHTML(target: [
                            allowMissing: false,
                            alwaysLinkToLastBuild: false,
                            keepAll: true,
                            reportDir: 'apidocs',
                            reportFiles: 'index.html',
                            reportName: 'Javadoc Report',
                            reportTitles: ''
                        ])
                    }
                }
            }
        }
    }
}
