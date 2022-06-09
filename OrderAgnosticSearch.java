public class OrderAgnosticSearch {

static int search(int arr[],int target){
    int s=0;
    int e =arr.length-1;
    int mid= s + (e-s)/2;
    if(arr[0]>arr[1]){
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
    else{
        while(s<=e){
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid = s +(e-s)/2;
        }
        return mid;
    }
}



    public static void main(String[] args) {
       // int arr[]={20,17,15,14,13,12,10,9,8,4};
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=4;
        int result = search(arr,target);
        System.out.println(result);
    }
}
