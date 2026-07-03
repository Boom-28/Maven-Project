pipeline {
    agent { label 'Worker1' }

    environment {
        APP_NAME    = 'calculator'
        VERSION     = '1.0.0'
        ARTIFACT    = "calculator-${VERSION}.jar"
        // For email notifications (configure credentials in Jenkins)
        EMAIL_TO    = 'your-email@example.com'
    }

    stages {

        stage('Checkout') {
            steps {
                echo '📥 Cloning source code from GitHub...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo '🔨 Building project with Maven...'
                sh 'mvn clean compile -B'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Running JUnit 5 unit tests...'
                sh 'mvn test -B'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo '📦 Packaging application as JAR...'
                sh 'mvn package -DskipTests -B'
                echo "Artifact created: target/${env.ARTIFACT}"
            }
        }

        stage('Archive Artifacts') {
            steps {
                echo '📁 Archiving build artifacts in Jenkins...'
                archiveArtifacts artifacts: "target/${env.ARTIFACT}",
                                  fingerprint: true,
                                  onlyIfSuccessful: true
            }
        }
    }
}
