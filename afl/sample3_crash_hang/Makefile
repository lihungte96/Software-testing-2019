all: sample3

sample3: sample3.cpp
	afl-g++ -fsanitize=address sample3.cpp -o sample3

fuzz: sample3
	afl-fuzz -m 300000000 -i testcase/ -o fuzz_output/ ./sample3

clean:
	rm sample3
