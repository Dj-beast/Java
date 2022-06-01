
import java.net.SocketPermission;
import java.util.Scanner;

public class multiplicationMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int row = sc.nextInt() ;
        System.out.println("enter no of columns");
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        int arr1[][]=new int[row][col];
        int mul[][]=new int[3][3];
        System.out.println("Enter first array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter second array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

       System.out.println("After multiplication");
     
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        for(int k=0;k<2;k++){
            System.out.println(mul[i][j]+=arr[i][k]*arr1[k][j]);
        }
        }
        }

    }
    
}
