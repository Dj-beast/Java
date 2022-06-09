public class FindMissingNumber268 {
    public static void main(String[] args) {
        int nums[]={9,6,4,2,3,5,7,0,1};
        int sum=0;
        int nsum=0;
       int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            
        }
        
        for(int i=0;i<=n;i++){
           
            nsum=nsum+i;
        }
        
        System.out.println(nsum-sum);
    }
    
}
