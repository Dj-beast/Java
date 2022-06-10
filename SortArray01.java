public class SortArray01 {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
       int count0=0;
       int count1=0;
       int count2=0;
       int print[]= new int[arr.length];
       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               count0++;  
           }
           if(arr[i]==1){
               count1++;
           }
           else{
               count2++;
           }
       }
     for(int i=0;i<count0;i++){//012
         print[i]=0;
     }
     for(int i=count0;i<count1+count0;i++){
      print[i]=1;  
    } 
     for(int i=(count1+count0);i<arr.length;i++){
        print[i]=2;  
      } 
    for(int ele:print){
        System.out.println(ele);
    }
    }
}
