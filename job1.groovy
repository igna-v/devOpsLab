job('Git Master check file') {
	description('Me fijo que esten los archivos')
	scm{
		git('https://github.com/igna-v/devOpsLab.git','master',{node -> node / 'extensions' << '' })
	}
	triggers {
		scm('* * * * *')
	}
	steps{
		shell(readFileFromWorkspace('shell.sh'))
	}
}
