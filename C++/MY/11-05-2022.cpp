#include <iostream>
using namespace std;
bool x,y;

void input(){
    cout<<"Enter <x> <y> (0 for  false , 1 for true) : ";
    cin>>x>>y;
    
}
bool conjuction(){
    return (x&&y);
}
bool disjunction(){
    return (x||y);
}
bool exclusiveOr(){
    return (x^y);
}
bool implies(){ // condition 
    if ((x==0) && (y==0)) return true;
    else if ((x==0) && (y==1)) return true;
    else if ((x==1) && (y==0)) return false;
    else if ((x==1) && (y==1)) return true;
}
bool biConditional(){
    return !(exclusiveOr());

}
void print (){
 cout<<"x ^ y: "<<conjuction()<<endl;
 cout<<"x v y: "<<disjunction()<<endl;
 cout<<"x  y: "<<exclusiveOr()<<endl;
 cout<<"x → y: "<<implies()<<endl;
 cout<<"x ↔ y: "<<biConditional()<<endl;
}
void truthTable(){
    cout<<"------------------------------------------------------------------"<<endl;
    cout<<"   X   |   Y   | x ^ y | x v y | x ⊕ y | x → y | x ↔ y |"<<endl;
    for(int X=0;X<2;X++){
        for(int Y=0;Y<2;Y++){
            x=X;
            y=Y;
            cout<<"   "<<X<<"    "<<"   "<<Y<<"    "<<"   "<<conjuction()<<"    ";
            cout<<"   "<<disjunction()<<"    "<<"   "<<exclusiveOr()<<"    ";
            cout<<"   "<<implies()<<"    "<<"   "<<biConditional()<<"    "<<endl;
            
        }
        
    }
    cout<<"------------------------------------------------------------------"<<endl;

}

int main(){
    input();
    print();
    truthTable();
    
}