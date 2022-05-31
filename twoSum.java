import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter how many elements you want in array:- ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x =arr.length;
        System.out.println("Enter target value");
        int target =sc.nextInt();
    
        for(int i=0;i<x-1;i++){
            for(int j=1;j<x;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("found at " + arr[i] +" and "+ arr[j]);
                    
                }
                break;
            }
        }
        sc.close();
    }
    
}
