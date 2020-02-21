job('Git Master check file') {
	description("Me fijo que esten los archivos")
	scm{
		git("https://github.com/igna-v/devOpsLab.git",master)
	}
	triggers {
		scm("* * * * *")
	}
	steps{
		shell('echo "Script executed from: ${PWD}";

archivo1=archivo.txt
archivo2=README.md
archivoMaster=A.txt
if [ -f "$archivo1" ]; then
    echo "$archivo1 exist"
else 
    exit 1
fi

if [ -f "$archivo2" ]; then
    echo "$archivo2 exist"
else 
    exit 1
fi

if [ -f "$archivoMaster" ]; then
    echo "$archivoMaster exist"
else 
    exit 1
fi')
	}
}
