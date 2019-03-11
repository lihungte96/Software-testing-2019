all: compile

compile:
	mkdir -p bin
	javac testcase/TestJunit.java testcase/TestRunner.java -d bin

test:
	cd bin ; java TestRunner

clean:
	rm bin/*.class
