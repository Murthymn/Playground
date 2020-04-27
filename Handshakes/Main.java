#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  std::cin>>n;
  if(n%2==0)
    s=(n/2)*n-2;
  else
    s=(n/2)*n;
  std::cout<<s;
}