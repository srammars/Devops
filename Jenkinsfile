node {  
    def mvnHome = tool 'maven-3.5.2'

    stage('Clone repo'){
        git branch: 'main', url: 'https://github.com/srammars/Devops.git'
    }

    stage('Build project'){
        sh"'${mvnHome}/bin/mvn' -B -DskipTests clean package"
    }
}