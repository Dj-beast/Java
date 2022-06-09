public class ZigZagArray {
    public static void main(String[] args) {
        int arr[]={4,3,7,8,6,2,1};
        for(int i=0;i<arr.length-2;i+=2){
        for(int j=i+1;j<arr.length-1;j+=2){
                 if(arr[i]>arr[j] || arr[j]<arr[j+1]){
                     int temp=arr[j];
                      arr[j] = arr[i];
                      arr[i] = temp;
                 }
                 break;

        }
    }
            
        
        for(int ele:arr){
            System.out.println(ele);
        }
    
    
}
}
