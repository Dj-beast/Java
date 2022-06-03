import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many times you want to rotate");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=arr.length-1;j>=arr.length-n;j--){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        /*for(int i=0;i<arr.length;i++){
            System.out.println("reverse "+arr);
        }*/
        for(int element :arr){
            System.out.println(element +" ");
        }
        sc.close();
    }
    
}
