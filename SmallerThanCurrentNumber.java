import java.util.ArrayList;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int arr[]={6,5,4,8};
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
                
            }
            nums.add(count);
            count=0;
        }
        for(int ele:nums){
            System.out.println(ele);
        }
    }
}
