all: compile

compile:
	mkdir -p bin
	javac src/TestJunit.java src/TestRunner.java -d bin

test:
	cd bin ; java TestRunner

clean:
	rm bin/*.class
