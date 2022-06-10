public class RangeQuerySum {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int sumarr[]= new int[arr.length];
        int sum=0;
        int sindex=2;
        int eindex=5;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            sumarr[i]=sum;
        }
        if(sindex==0){
            System.out.println(sumarr[eindex]);
        }
        else{
      int total = sumarr[eindex]-sumarr[sindex-1];
      System.out.println(total); 
        }       
    }
}
