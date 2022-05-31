import java.util.Scanner;

public class spanofArray
 {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter how many elements you want in array:- ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        //Finding min
       int min=arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }
       }
       System.out.println("min element is:- "+min);


        
        
        //Finding max
       int max=arr[0];
       for(int i=0;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
           }
       }
       System.out.println("max element is:- "+max);

                //Finding SPAN
         int span=max-min;
         System.out.println("Value of span is:- "+span);
         sc.close();
    }

}
