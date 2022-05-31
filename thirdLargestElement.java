import java.util.Scanner;



public class thirdLargestElement {

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

        for(int i=0;i<x-1;i++){
            for(int j=i+1;j<x;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
           /* System.out.println("after sorting");
            for(int i=0;i<x;i++){
            System.out.println(arr[i]);
            //System.out.println("third largest element " +arr[x-3]);
        }*/
       
        System.out.println("third largest element " );
        for(int i=0;i<x;i++){
            System.out.println(arr[x-3]);
            break;
        }
    }
    
    
}
