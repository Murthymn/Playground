#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0,s=0;
  float a;
  std::cin>>n;
  while(count<3 && s<1)
  {
    if(n<0)
    {
      a=a-1;
      s++;
    }
   else if(n%2!=0)
    {
      a=a+1;
      count++;
      std::cin>>n;
    }
    else if(n%2==0)
    {
      a=a-0.5;
      std::cin>>n;
    }
  }
  std::cout<<a;
  return 0;
  
}