#include <iostream>
using namespace std;
int main() 
{
    int n;
  cin>>n; 
  if(n>30)
    {
      cout<<"Invalid Input";
      return 0;  
    }
     else
     {
       if(n==1 || n==2)
         cout<<n;
       else
       {
         int t1=1;
       int t2=2;
         int term;
         for(int i=3;i<=n;i++)
         {
           term=t1+t2;
           t1=t2;
           t2=term;
         }
      cout<<term;
     }
     }
  return 0;
}