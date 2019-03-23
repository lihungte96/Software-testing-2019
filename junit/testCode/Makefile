all: compile compileTest

compile:
	mkdir -p bin
	javac src/Distant.java -d bin

compileTest:
	mkdir -p bin
	javac -classpath /usr/share/java/junit4.jar src/Distant.java testcase/TestDistant.java testcase/TestRunner.java -d bin

test:
	cd bin ; java -classpath .:/usr/share/java/junit4.jar TestRunner

runCov:
	cd bin ; java -javaagent:../lib/jacocoagent.jar -cp /usr/share/java/junit4.jar:. TestRunner

calCov:
	cd bin ; java -jar ../lib/jacococli.jar report jacoco.exec --classfiles ../bin \
	--sourcefiles ../src --sourcefiles ../testcase --html report

showCov:
	cd bin/report ; python3 -m http.server 8000

clean:
	rm bin/*.class bin/*.exec
