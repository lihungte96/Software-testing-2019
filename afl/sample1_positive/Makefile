all: sample1

sample1:
	$(CXX) sample1.cpp -o sample1

fuzz: sample1
	afl-fuzz -i testcase/ -o fuzz_output/ ./sample1

fuzz_non_instrument: sample1
	afl-fuzz -n -i testcase/ -o fuzz_output/ ./sample1

clean:
	rm sample1
