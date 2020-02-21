pipeline {
	agent any
	stages ("Check files for both") {
		stage("Check jenkins branch") { 
			steps{
				build job: 'Git Master check file'
			}
		}
		stage("build") { 
			steps{
				build job: 'Git Jenkins check file'
			}
		}
		stage("deploy") { 
			steps{
				echo "Ambas branches tienen los archivos"
			}
		}
	}
}

