public class FindingFirstLastIndex {

    static int search(int arr[], int ele){
        int s=0;
        int e = arr.length-1;
        int mid = s +(e-s)/2;
        int result=-1;
        while(s<=e){
            if(arr[mid]==ele){
               result = mid;
                e=mid-1;
                
            }
            if(arr[mid]>ele){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid = s +(e-s)/2;
        }
return result;
    }

    static int lsearch(int arr[], int ele){
        int s=0;
        int e = arr.length-1;
        int mid = s +(e-s)/2;
        int result1=-1;
        while(s<=e){
            if(arr[mid]==ele){
               result1 = mid;
                s=mid+1;
                
            }
            if(arr[mid]>ele){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid = s +(e-s)/2;
        }
return result1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,3,5};
        int ele=3;
        int res = search(arr,ele);
        int res2 = lsearch(arr,ele);
        System.out.println("First index of element is " +res);
        System.out.println("Last index of element is " +res2);
    }
    
}
