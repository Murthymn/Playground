#include<iostream>
int main()
{
  int n,m,req,sum=1;
  std::cin>>m>>n>>req;
  for(int i=1;i<=n;i++){
      sum=sum*m;
  }
    if(sum>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}