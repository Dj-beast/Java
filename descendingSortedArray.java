public class descendingSortedArray {

static int search(int arr[], int target){
    
int s=0;
int e=arr.length-1;
int mid = s +(e-s)/2;

while(s<=e){
    if(arr[mid]==target){
        return mid;
    }
    if(target>arr[mid]){
        e=mid-1;
    }
    else{
        s=mid+1;
    }
    mid = s +(e-s)/2;
}
return mid;
}



    public static void main(String[] args) {
        int arr[]={20,17,15,14,13,12,10,9,8,4};
        int target=14;
        int result = search(arr,target);
        System.out.println(result);
    }
    
}
