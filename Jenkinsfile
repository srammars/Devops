node {  
    def mvnHome = tool 'maven-3.5.2'

    stage('Clone repo'){
        git branch: 'devops', url: 'https://github.com/srammars/Devops.git'
    }

    stage('Build project'){
        dir('demo') { // Change le répertoire courant en 'demo' où se trouve le pom.xml.
            // Compile le projet sans exécuter les tests
            sh "'${mvnHome}/bin/mvn' -B -DskipTests clean package"
            
            // Génère le Javadoc
            sh "'${mvnHome}/bin/mvn' javadoc:javadoc"
        }
    }

    stage('Publish Javadoc') {
    dir('demo/target/site/apidocs') {
        publishHTML([
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: '',
            reportFiles: 'index.html',
            reportName: 'Javadoc Report',
            reportTitles: ''
        ])
    }
}

}