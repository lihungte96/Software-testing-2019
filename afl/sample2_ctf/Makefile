all: sample2

sample2: sample2.cpp
	afl-g++ sample2.cpp -o sample2

asan: sample2.cpp
	afl-g++ -fsanitize=address sample2.cpp -o sample2

fuzz: sample2
	afl-fuzz -m 30000000 -i testcase/ -o fuzz_output/ ./sample2

clean:
	rm sample2

