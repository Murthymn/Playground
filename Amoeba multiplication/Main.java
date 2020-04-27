#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c,a=0,b=1;
  std::cin>>n;
  for(int i=1;i<n-1;i++){
   c=a+b;
    a=b;
    b=c;
  }
  std::cout<<c;
}
  