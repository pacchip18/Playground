#include <iostream>
#include <math.h>
using namespace std;

int main() 
{
  int n;
   cin>>n;
  if(n%2==1)
   {
  	  int i=1;
      int r=2;
   	  int terms=(n+1)/2;
  	  int number=i*pow(2,terms-1);
    	cout<<number;
   }
      else
      {
        int i=1;
        int r=3;
   	 	int terms=(n/2);
  	    int number=i*pow(3,terms-1);
      	cout<<number; 
      }
  return 0;
}