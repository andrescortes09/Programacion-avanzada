#include <iostream>
#include <fstream>
#include <cstring>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int counter;
  void myFunction (int counter) {
    if(counter==0) {
     return;
    }
    else {
      cout<<"hello"<<counter<<endl;
      myFunction(--counter);
      cout<<counter<<endl;
      return;
    }
  }

int main() {
  cin>>counter;
  myFunction (counter);
}