all: compileTest

SimpleSocket: compileTest runSocketCov calCov showCov

Simple: compileTest runCov calCov showCov

compileTest:
	mkdir -p bin
	javac -classpath /usr/share/java/junit4.jar:/usr/share/java/mockito-core.jar \
	src/Factorization.java src/Multiplication.java \
	testcase/TestMultiplication.java  testcase/TestRunner.java -d bin

testSocket:
	cd bin ; java -classpath .:/usr/share/java/junit4.jar:/usr/share/java/mockito-core.jar TestRunner Socket

test:
	cd bin ; java -classpath .:/usr/share/java/junit4.jar:/usr/share/java/mockito-core.jar TestRunner

runCov:
	rm bin/*.exec 2> /dev/null || true
	cd bin ; java -javaagent:../lib/jacocoagent.jar -cp .:/usr/share/java/junit4.jar:/usr/share/java/mockito-core.jar TestRunner

calCov:
	cd bin ; java -jar ../lib/jacococli.jar report jacoco.exec --classfiles ../bin \
	--sourcefiles ../src --sourcefiles ../testcase --html reportDir

showCov:
	RED="\033[0;31m" ; NC='\033[0m' ; printf "$${RED}http://" ; curl -s https://api.ipify.org/ ; printf ":8000/$${NC}\n"
	cd bin/reportDir ; python3 -m http.server 8000

kill:
	killall python3

clean:
	rm -r bin/*.class bin/*.exec bin/reportDir 2> /dev/null || true
