public class leaderArray {
    

    public static void main(String[] args) {
        
        int arr[]={16,17,4,3,5,2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if (arr[i] < arr[j])
                {
                    break;
                }
	
                if (j == n - 1)
                    System.out.println(arr[i]+" is a leader");
            }
                
            }
        }
    }
    

