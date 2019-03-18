all: compile

compile:
	mkdir -p bin
	javac -classpath /usr/share/java/junit4.jar testcase/TestBeforeAfter.java testcase/TestRunner.java -d bin

test:
	cd bin ; java -classpath .:/usr/share/java/junit4.jar TestRunner

clean:
	rm bin/*.class
