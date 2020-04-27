#include<iostream>
int main()
{
  int n,a,i; 
  float t[100];
  t[0]=0.5;t[1]=1.5;
  std::cin>>n;
if(n==1)
  std::cout<<t[0];
  else if(n==2)
    std::cout<<t[0]<<" "<<t[1];
if(n>2){
    for(i=2;i<=n;i++){
    float temp=t[i-1];
      float untemp=t[i-2];
      a=(temp-untemp)*3;
      t[i]=t[i-1]+a;
    }
  for(i=0;i<n;i++){
    std::cout<<t[i]<<" ";
  }
}
  
    
}