// C++ program to demonstrate the use of rand() to get value
// in a range of 0 to N
#include <ctime>
#include <cstdlib>
#include <iostream>
using namespace std;

int main()
{
	float Vector[9];
	int O = 0;
  srand(time(NULL));
	// This program will create some sequence of random
	// numbers on every program run within range N
	for (int i = 0; i < 10; i++){
		Vector[i] = rand() % 26;
		cout << Vector[i] << " - ";
    }
    for (int i=0; i <= 10; i = i+1){
        cout << "\nSeleccione La Posición Deseada: \n";
        cin >> O;
        cout << Vector + (O - 1) << endl;
        cout << Vector[O - 1] << endl;
    }
	return 0;
	
}