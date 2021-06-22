pipeline{
//     agent any
	agent {
		docker{
			image 'maven:3.6.3'
		}
	}
    stages{
	    stage("Maven"){
            steps{
                sh 'mvn --version'
            }
        }
        stage("Build"){
            steps{
                echo("Build")
            }
        }
        stage("Test"){
            steps{
                echo("Test")
             }
        }

    }
    post {
		always {
			echo 'I run always'
		}
		success {
			echo 'I run when you are successful'
		}
		failure {
			echo 'I run when you fail'
		}
	}
}
// checking automatic build trigger
