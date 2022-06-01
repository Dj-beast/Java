import java.util.Scanner;

public class snakePatternMatrix {
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

for(int i=0;i<arr.length;i++){
    if(i%2==0){
        for(int j=0;j<arr[i].length;j++){
            System.out.println(arr[i][j]+ " ");
        }
        System.out.println();
    }
    else{
        for(int j=arr.length-1; j>=0; j--)

        {

            System.out.print(arr[i][j]+ " ");

        }

        System.out.println();
    }
}


    }
}
