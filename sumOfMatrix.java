import java.util.Scanner;

public class sumOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int row = sc.nextInt() ;
        System.out.println("enter no of columns");
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        int arr1[][]=new int[row][col];
        int sum[][]=new int[3][3];
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

       System.out.println("After addition");
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            sum[i][j]=arr[i][j]+arr1[i][j];
        }
    }

for(int i=0;i<sum.length-1;i++){
    for(int j=0;j<sum.length-1;j++){
        System.out.print(sum[i][j]+" ");
    }
    System.out.println();
    }
    
}
}
