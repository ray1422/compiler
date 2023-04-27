all: .gen_code
	javac -cp ./antlr-4.12.0-complete.jar Cactus*.java

CactusBaseListener.java  CactusLexer.java  CactusListener.java  CactusParser.java: .gen_code

.gen_code: Cactus.g4
	antlr4 Cactus.g4
	touch .gen_code

test:
	grun Cactus program -tree -token < ${FILE}

clean:
	rm -f *.class *.tokens CactusBaseListener.java  CactusLexer.java  CactusListener.java  CactusParser.java .gen_code