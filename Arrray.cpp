#include<iostream>;
using namespace std;

int main(){
    int max1,max2,max3;
    int n=sizeof(arr)/sizeof(arr[0]);
    if(n<3){
        return -1;
        
    }
    if(arr[0]>arr[1]&& arr[0]>arr[2]){
        max1=arr[0];
        max2=max(arr[1],arr[2]);
        max3=min(arr[1],arr[2]);
    }else if(arr[1]>arr[0]&& arr[1]>arr[2]){
        max1=arr[1];
        max2=max(arr[0],arr[2]);
        max3=min(arr[0],arr[2]);
    }else{
        max1=arr[2];
        max2=max(arr[0],arr[1]);
        max3=min(arr[0],arr[1]);
    }
    for(int i=3;i<n;i++){
        if(arr[i]>max1){
            max3=max2;
            max2=max1;
        
            max1=arr[i];
        }else if(arr[i]>max2){
            max3=max2;
            max2=arr[i];
        }else if(arr[i]>max3){
            max3=arr[i];
        }
    }
    cout<<max1;
    cout<<max2;
    cout<<max3;
}