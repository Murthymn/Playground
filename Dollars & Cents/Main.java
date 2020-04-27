#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  std::cin>>d;
  int dol,ce;
  dol=(a+c);
  ce=(b+d);
   if(ce>100){
     dol++;
     ce=ce%100;
   }
  std::cout<<dol<<'\n';
  std::cout<<ce;
}