public class LargestelementInArray {

    static int search(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          }
        }
    return max;
}



    public static void main(String[] args) {
        int arr[]={10,20,11,32,77,9,2,99};
        int result = LargestelementInArray.search(arr);
        System.out.println(result);
    }
}
