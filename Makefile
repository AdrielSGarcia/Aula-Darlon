
all: build run clear

build:
	@javac -d bin Main.java

run:
	@java -cp bin Main

clear:
	@rm bin/Main.class
	@rm bin/aula/Aula20.class