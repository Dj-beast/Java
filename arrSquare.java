public class arrSquare {
    
    
	public static void main(String[] args) {
		int arr[]={-7,-5,2,0,1};
		int l=arr.length;
        int square[]=new int[l];
        for(int i=0;i<l;i++){
            square[i]=arr[i]*arr[i];
        }
        /*for(int ele:square){
            System.out.println(ele);
        }*/
        for(int j=square.length-1;j>=0;j--){
            System.out.println(square[j]);
        }
	}
}
