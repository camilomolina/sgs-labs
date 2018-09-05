#!groovy

node {
    def antHome
    def mvnHome
    def sonarHome

    env.JAVA_HOME = '/usr/lib/jvm/jdk1.8.0_121'

    stage('Environment') {
        echo 'Environment'

        antHome = '/usr/local/bin/apache-ant-1.9.13'
        mvnHome = '/usr/local/bin/apache-maven-3.5.4'
        sonarHome = '/usr/local/sonar-scanner-3.2.0.1227-linux'

        sh 'printenv'

        checkout scm
    }
    stage('Build') {
        echo 'Building'

        sh "${mvnHome}/bin/mvn clean"
        sh "${mvnHome}/bin/mvn install"
    }
    stage('Test') {
        echo 'Testing'

        sh "${sonarHome}/bin/sonar-scanner"
    }
    stage('Deploy') {
        echo 'Deployment'

        //ansiblePlaybook(playbook: 'deploy.yml')
    }
    stage('Results') {
        archive "ms1.0.0.1.jar"

        def mailRecipients = "camilo@bennu.cl"
        def jobName = currentBuild.fullDisplayName

        emailext body: '''${SCRIPT, template="groovy-html.template"}''',
            mimeType: 'text/html',
            subject: "[Jenkins] ${jobName}",
            to: "${mailRecipients}",
            replyTo: "${mailRecipients}",
            recipientProviders: [[$class: 'CulpritsRecipientProvider']]
    }

}


