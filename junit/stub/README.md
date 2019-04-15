## Makefile

### Run Java program

make [all] - Compile JAVA class

make runServer - Run TCP server example

make runClient - Run TCP client example

### Run unittest
Test client only

make compileTest - Compile Junit testing class

make test - Do unittest

make Simple - make {clean, compileTest, runCov, calCov, showCov}

make runCov - Execute & record code coverage

make calCov - Calculate coverage & report to a HTML file

make showCov - Use python HTTP server to show HTML

make clean - removes all files generated by make