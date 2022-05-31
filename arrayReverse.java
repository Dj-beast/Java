import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want in array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array that need to be reversed");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = arr.length;

        //reverse logic
     /*  for(int i=0;i<x-1;i++){
            for(int j=1;j<x;j++){
                int a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
            }
        }*/
        
        
        for (int i = x-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  

        sc.close();
    }
    
}
