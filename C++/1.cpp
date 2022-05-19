#include <iostream>
#include <cmath>
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
void cardiniality(int * arr){
    
    int cnt=l;
    for(int a=0;a<l;a++){
        for (int b=a+1;b<l;b++){
            if (*(arr+a)==*(arr+b)){
                cnt-=1;
                break;
            }
            
        }
    }
    
    cout<<"Cardiniality of set : "<<cnt<<endl;
}
void powerset(int * arr){
    int cnt=l;
    for(int i=0;i< 2)
}
int main(){
    l=7;
    int arr[l]={1,1,1,1,1,1,7};
    cardiniality(&arr[0]);
    cout<<(ismember(6,&arr[0])?"True":"False");
}
