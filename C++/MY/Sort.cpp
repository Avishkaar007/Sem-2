#include <iostream>
using namespace std;
void print(int * arr,int len);
void space(int len){
    for(int i=0;i<len;i++){
        cout<< " ";
    }
    cout<<"j"<<endl;
}
void bubbleSort(int * arr,int len){
    for (int a=0;a<len-1;a++){
        for(int b=0;b<len-a-1;b++){
            if (*(arr+b)>*(arr+b+1)){
                int temp;
                temp=*(arr+b);
                *(arr+b)=*(arr+b+1);
                *(arr+b+1)=temp;
                print(arr,len);
            }
            
        }
        cout<<endl;
    }
}
void insertionSort(int * arr,int len){
    int key;
    int j;

    for (int i=1;i<len;i++){
        key=arr[i];
        j=i-1;
        
        while(j>=0 && arr[j]>key ){
            arr[j+1]=arr[j];
            j-=1;
            space(i);
            print(arr,len);
        }
        arr[j+1]=key;
        cout<<endl;
    }
}
void print(int * arr,int len){
    for (int a=0;a<len;a++){
        cout<<" "<<*(arr+a);
    }
    cout<<endl;
}
int main(){
    int arr[]={5,4,3,6,7,13,2,5,8,1};
    int len=sizeof(arr)/4;
    cout<<len<<endl;
    cout<<"Original Array : ";
    print(&arr[0],len);
   
    insertionSort(&arr[0],len);
    cout<<"After Sort ";
    print(&arr[0],len);
}