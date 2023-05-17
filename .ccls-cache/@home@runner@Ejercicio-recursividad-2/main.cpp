#include <iostream>
#include <fstream>
#include <cstring>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

class Suma {
  public:
    int function (int num1, int num2){
      return num1+num2;
    }
  int function (int num1, int num2, int num3){
    return num1+num2+num3;
  }
};
int main (){
  Suma objeto;
  cout << objeto.function(23,10,5) << endl;
  cout << objeto.function(15,2);

}