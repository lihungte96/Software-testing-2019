all: compile compileTest

compile:
	mkdir -p bin
	javac src/Distant.java -d bin

compileTest:
	mkdir -p bin
	javac src/Distant.java testcase/TestDistant.java testcase/TestRunner.java -d bin

test:
	cd bin ; java TestRunner

clean:
	rm bin/*.class
