job('Git Jenkins check file') {
	description('Me fijo que esten los archivos')
	scm{
		git('https://github.com/igna-v/devOpsLab.git','jenkins',{node -> node / 'extensions' << '' })
	}
	triggers {
		scm('* * * * *')
	}
	steps{
		shell(readFileFromWorkspace('shell.sh'))
	}
}
