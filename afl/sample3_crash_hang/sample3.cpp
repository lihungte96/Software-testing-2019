#include <iostream>
#include <stdexcept>
using namespace std;
#define length 20
int main()
{
	int index = 0;
	int array[length];
	cout << "Index: ";
	cin >> index;

	// hang
	if (index >= length)
		while (true)
			;

	// crash
	if (index == -6666)
		throw std::invalid_argument("You did it");

	//array[index] = 0;
	return 0;
}
