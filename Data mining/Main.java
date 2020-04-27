#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a,b,c,d,e=0,f=0,g=0,h=0,i=0,j=0,sum,sum1;
  std::cin>>n;
  if(n>100){
    a=n/100;
  b=n%100;
  }
  if(b<100 && b>10){
    c=b/10;
    d=b%10;
  }
  if(a%2==0){
    e=a+0;
    a+1;
  }
  else
    f=a+0;
    if(c%2==0){
    g=c+0;
    c+1;
  }
  else
    h=c+0;
    if(d%2==0){
    i=d+0;
    d+1;
  }
  else
    j=d+0;
  if(e+g+i==f+h+j)
    std::cout<<"Yes";
else
 std::cout<<"No";
  
}