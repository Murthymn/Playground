#include<iostream>
int main()
{
  int min,max,n,sum,i,j;
  std::cin>>min;
  std::cin>>max;
  for(i=min;i<=max;i++){
    n=i;
    sum=0;
   for(j=1;j<n;j++){
     if(n%j==0){
      sum=sum+j;
    }
   }
  if(sum==n)
  std::cout<<sum<<" ";
}
}