#include<iostream>
using namespace std;
void fib(int n){

    int t1=0;
    int t2=1;
    int nextTERM;

    for (int i = 1; i <= n; i++)
    {
        cout<<t1<<endl;
        nextTERM=t1+t2;
        t1=t2;
        t2=nextTERM;
    }
    return;
}

int main(){

    int n1;
    cin>>n1;

    fib(n1);

    return 0;
}
