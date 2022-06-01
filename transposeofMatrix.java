import java.util.Scanner;

public class transposeofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int row = sc.nextInt() ;
        System.out.println("enter no of columns");
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        int t[][]=new int[3][3];
        System.out.println("Enter  array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of given matrix will be");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[j][i]+" ");
                
            }
            System.out.println();
        }
sc.close();
    }
    
}
//transpose
