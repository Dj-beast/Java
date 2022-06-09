import java.util.Scanner;

public class binarySearch {
    
   static int bsearch(int arr[], int target){
          int low = 0;
          int high = arr.length-1;
          int mid= low + (high-low)/2;
          while(low<=high){
            if(mid==target){
              return mid;
            }
            
            if(target>mid){
              low = mid +1;
            }
            else{
            high = mid-1;
            }
            mid=low + (high-low)/2;
          }
return -1;
   }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter how many elements you want in array");
      int n=sc.nextInt();
      int arr[] = new int[n];
      System.out.println("please enter values in array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("please enter the value which you want to find");
      int target=sc.nextInt();
      //binarySearch bs = new binarySearch();
      int result = binarySearch.bsearch(arr,target);
              System.out.println("found at "+result);

              sc.close();
}

}
