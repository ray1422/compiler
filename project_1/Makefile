all: CactusBaseListener.java  CactusLexer.java  CactusListener.java  CactusParser.java
	javac -cp ./antlr-4.12.0-complete.jar Cactus*.java

Cactus*.java: Cactus.g4
	antlr4 $<

test:
	grun Cactus token -tree -token < ${FILE}