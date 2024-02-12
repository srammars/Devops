pipeline {
    agent any
    triggers {
        pollSCM('H/3 * * * *')
    }
    tools {
        maven 'maven-3.5.2' // Assurez-vous que 'M3' correspond au nom de votre installation Maven configurée dans Jenkins.
    }
    stages {
        stage('Clone repo') {
            steps {
                git branch: 'devops', url: 'https://github.com/srammars/Devops.git'
            }
        }
        stage('Build project') {
            steps {
                dir('demo') {
                    // L'option -DskipTests est utilisée pour passer l'exécution des tests.
                    sh "'${mvnHome}/bin/mvn' -B -DskipTests clean package"
                }
            }
        }
        // La stage 'Publish Javadoc' a été retirée car vous ne voulez pas de Javadoc.
    }
}
