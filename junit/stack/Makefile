all: compile compileTest

compile:
	mkdir -p bin
	javac src/Stack.java -d bin

compileTest:
	mkdir -p bin
	javac src/Stack.java testcase/TestStack.java testcase/TestRunner.java -d bin

test:
	cd bin ; java TestRunner

clean:
	rm bin/*.class
