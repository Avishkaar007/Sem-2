#include <iostream>
#include <math.h>

using namespace std;

bool ismember(int size,int A[]){
    int a;
    cout << "\nEnter the element to be searched: ";
    cin >> a;

    for(int i=0;i<size;i++)
    {
        if(A[i]==a)
            return true;
    }
    return false;
}

void PowerSet(int arr[], int size){
    int b[]={0,0,0,0};
    int r=pow(2,size);
    cout<<"\nPower Set\n";
    cout<<"{ ";
    for(int i=0; i<r; i++){
        int n=0;
        for(int l=i;l>0;l=l/2){
            b[n]=l%2;
            n++;
        }
        cout<<"{ ";
        for(int j=0;j<size;j++){
            if(b[j]==1){
                cout<<arr[j]<<"  ";
            }
        }
        if(i==0){
            cout<<" } , ";
        }else{
            cout<<"\b} , ";
        }
    }
    cout<<"\b } ";
    cout<<endl;
}

int main(){
    bool x;
    int size;
	char ch = 'y';
	while(ch == 'y')
	{
		cout << "\nEnter the size of set: ";
		cin >> size;

		int A[size];
		cout << "\nEnter the elements: ";
		for(int i=0;i<size;i++)
		{
			cin >> A[i];
		}
        int count = 1;
        for(int i=1;i<size;i++){
            int j=0;
            for(j=0;j<1;j++){
                if(A[i]==A[j]){
                    break;
                }
            }
            if(i==j){
                count++;
            }
        }
        cout<<"Cardinatlity of Given set : "<<count;
		x=ismember(size,A);
		if(x==true)
			cout << "\n\tValue is present!!!";

		else
			cout << "\n\tValue is not present!!!";

		cout << "\n\nThe possible subset pairs\n" << endl;
		PowerSet(A,size);
		
		cout << "\nDo you want to continue? (Y/N): ";
		cin >> ch;
	}
	cout << "\n@@@@EXITING@@@";
	return 0;
}