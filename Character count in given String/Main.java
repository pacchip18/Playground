#include <iostream>
#include <string>
using namespace std;

int main() 
{
   // Try out your code here
  string a;
  cin>>a;
  int count=1,i,len=a.length();
  if(len>20)
  {
    cout<<"Invalid Input";
     return 0;   
  }
    else
    {
      for(i=1;i<=len;i++)
      {
        if(a[i]==a[i-1])
          count++;
         else
        {
          cout<<a[i-1]<<count;
        count=1;
         }
       }
    }

 return 0;
}