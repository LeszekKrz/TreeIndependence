all:	exact

exact:
	javac -d out/ -cp "Libs/*" tw/exact/*.java

clean: 
	rm tw/*/*.class