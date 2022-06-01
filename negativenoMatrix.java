import java.util.Scanner;

public class negativenoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int row = sc.nextInt() ;
        System.out.println("enter no of columns");
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        
        
        System.out.println("Enter  array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
 int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]<0){
                    System.out.println("this number is negative "+arr[i][j]);
                    count++;
                }
            }
        }
        System.out.println("total number of negative numbers are "+count);
sc.close();
    }
}
