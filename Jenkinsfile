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

    stage('Generate Javadoc') {
        dir('demo') {
            sh "'${mvnHome}/bin/mvn' javadoc:javadoc"
            // Ajouter une étape de débogage pour lister les fichiers générés
            sh 'ls -l target/site'
        }
    }

    stage('Publish Javadoc') {
        // Supposons que la Javadoc est générée dans 'demo/target/site/apidocs' après la construction du projet.
        dir('demo/target/site/apidocs') {
            // Ici vous pouvez définir comment vous voulez publier la Javadoc.
            // Par exemple, vous pouvez utiliser `archiveArtifacts` pour archiver la Javadoc dans Jenkinss.
            archiveArtifacts artifacts: '**/apidocs/**/*', allowEmptyArchive: true
        }
    }


}
