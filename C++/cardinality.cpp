#include <iostream>
using namespace std;
int l;
bool ismember(int a,int * arr){
    for(int i=0;i<l;i++){
        if (a==*(arr+i)){
            return true;
        }
    }
    return false;
}
int main(){
    l=7;
    int arr[7]={1,1,1,1,1,1,1};
    int cnt=l;
    for(int a=0;a<l;a++){
        for (int b=a+1;b<l;b++){
            if (arr[a]==arr[b]){
                cnt-=1;
                break;
            }
            
        }
    }
    
    cout<<"Cardiniality of set : "<<cnt<<endl;
    cout<<ismember(1,&arr[0]);
}
