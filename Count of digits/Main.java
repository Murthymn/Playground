#include<iostream>
int main()
{
  // Type your code here
  int n;
  int count=0;
  std::cin>>n;
  do
  {
    count++;
    n=n/10;
}
  while(n>0);
  std::cout<<count;
}
    