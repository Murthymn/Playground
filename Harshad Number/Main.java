#include<iostream>
int main()
{
  int n,temp,m,sum=0;
  std::cin>>n;
  temp=n;
  while(n>0){
    m=n%10;
    sum=sum+m;
    n=n/10;
  }
  if(temp%sum==0)
    std::cout<<"Harshad Number";
  else
   std::cout<<"Not Harshad Number";
}