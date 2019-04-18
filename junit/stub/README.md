## Makefile

### Run Java program

`make [all]` - Compile JAVA class

`make runServer` - Run TCP server example

`make runClient` - Run TCP client example

### Run unittest
Test client only

`make compileTest` - Compile Junit testing class

`make testSocket` - Do unittest with Socket

`make test` - Do unittest with stub

### Show Jacoco coverage Web page

`make SimpleSocket` - make {clean, compileTest, runSocketCov, calCov, showCov}

`make Simple` - make {clean, compileTest, runCov, calCov, showCov}