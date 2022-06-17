public class PatternMatch {
    public static void main(String[] args) {
        String str="KLKLKLKLKLKLKLLLKLKLKLKLKLL";
        String pattern="KL";
        int count=0;
        if(str.length()!=0){
        for(int i=0;i<=str.length()-pattern.length();i++){
            for(int j=0;j<pattern.length();j++){
                if(pattern.charAt(j)==str.charAt(i+j)){
                    count++;   
                }
            }
            if(count==pattern.length()){
                System.out.println(i);
                count=0;
            }
            else{
                count=0;
            }
        }
    }
    else{
        System.out.println("not possible");
    }
    }
}
