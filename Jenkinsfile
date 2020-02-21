pipeline {
	agent any
	stages ("Check files for both") {
		stage("Check Master branch") { 
			steps{
				build job: 'Git Master check file'
			}
		}
		stage("Check Jenkins branch") { 
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

