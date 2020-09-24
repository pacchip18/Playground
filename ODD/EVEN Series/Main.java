#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,number,a=0,d=2;
  cin>>n;
  if(n%2==1)
  {
    number=n-1;
    cout<<number;
  }
  else
  {
    number=(n-2)/2;
    cout<<number;
  }
    return 0;
}