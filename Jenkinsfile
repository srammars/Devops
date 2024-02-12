node {
    def mvnHome = tool 'maven-3.5.2'

    // Ajouter le trigger de polling SCM
    properties([
        pipelineTriggers([pollSCM('H/3 * * * *')])
    ])

    stage('Clone repo') {
        git branch: 'devops', url: 'https://github.com/srammars/Devops.git'
    }

    stage('Build project') {
        dir('demo') { // Changez le répertoire courant en 'demo' où se trouve le pom.xml.
            sh "'${mvnHome}/bin/mvn' -B -DskipTests clean package"
        }
    }
}
