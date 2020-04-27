#include<iostream>
int main()
{
  int n,m,r;
  std::cin>>n;
  std::cin>>m;
  int sum=n+m;
   for(int i=1;i<sum;i++){
     while(sum%i==0){
      r=r+i;
       break;
    }
   }
  if(r==sum)
  std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}