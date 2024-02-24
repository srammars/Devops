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
        dir('demo') {
            // Nettoyez l'espace de travail avant de construire pour éviter l'accumulation de fichiers.
            cleanWs()
            sh "'${mvnHome}/bin/mvn' -B -DskipTests clean package"
        }
    }

    stage('Generate Javadoc') {
        dir('demo') {
            sh "'${mvnHome}/bin/mvn' javadoc:javadoc"
            // Ajouter une étape de débogage pour lister les fichiers générés
            sh 'ls -l target/site'
        }
    }

    stage('Publish Javadoc') {
        dir('demo/target/site') {
            // Assurez-vous que le chemin pour archiver la Javadoc est correct et optimisé.
            archiveArtifacts artifacts: 'apidocs/**/*', allowEmptyArchive: true
        }
    }
}
