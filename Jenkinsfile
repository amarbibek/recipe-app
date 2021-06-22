pipeline {
// 	agent any
	agent { docker { image 'apache-maven-3.8.1'} }
	// agent { docker { image 'node:13.8'} }
// 	environment {
// 		dockerHome = tool 'myDocker'
// 		mavenHome = tool 'apache-maven-3.8.1'
// 		PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
// 	}

	stages {
		stage('Checkout') {
			steps {
				sh 'mvn --version'
// 				sh 'docker version'
// 				echo "Build"
// 				echo "PATH - $PATH"
// 				echo "BUILD_NUMBER - $env.BUILD_NUMBER"
// 				echo "BUILD_ID - $env.BUILD_ID"
// 				echo "JOB_NAME - $env.JOB_NAME"
// 				echo "BUILD_TAG - $env.BUILD_TAG"
// 				echo "BUILD_URL - $env.BUILD_URL"
			}
		}
		stage('Compile') {
			steps {
				sh "mvn clean compile"
			}
		}

		stage('Test') {
			steps {
				sh "mvn test"
			}
		}

		 
 
 

		 
	} 
	
	post {
		always {
			echo 'Im awesome. I run always'
		}
		success {
			echo 'I run when you are successful'
		}
		failure {
			echo 'I run when you fail'
		}
	}
}
