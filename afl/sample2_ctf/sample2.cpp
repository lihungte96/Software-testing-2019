#include <iostream>
using namespace std;
int main()
{
	int a[20];
	int index = 0;

	cout << "Index: ";
	// chose an index to write
	cin >> index;

	// check index position
	if (index >= 20)
		return -1;

	cout << "Value: ";
	// write data to index
	cin >> a[index];
	return 0;
}
