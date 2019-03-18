all: compile compileTest

compile:
	mkdir -p bin
	javac src/Stack.java src/EmptyStackException.java src/FullStackException.java -d bin

compileTest:
	mkdir -p bin
	javac -classpath /usr/share/java/junit4.jar src/Stack.java \
		src/EmptyStackException.java src/FullStackException.java \
		testcase/TestException.java testcase/TestRunner.java -d bin

test:
	cd bin ; java -classpath .:/usr/share/java/junit4.jar TestRunner

clean:
	rm bin/*.class
