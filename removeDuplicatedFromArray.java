import java.util.Scanner;

public class removeDuplicatedFromArray {
    public static void main(String[] args) {
        /*  Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter how many elements you want in array:- ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }*/
        int arr[]={1,1,1,1,1,2,2,2,4,4,4};
        int j=0;
        //int start=0;
        //int end=arr.length;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        //sc.close();
        System.out.println(j+1);
    }  
    }
















       /* for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=n;j++){
                     if(arr[i]==arr[j+1]){
                         arr[j+1]=arr[j+2];
                     }
            }
        }
        System.out.println("******************");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }*/
    
//}
