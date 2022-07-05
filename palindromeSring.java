public class palindromeSring {
    public static void main(String[] args) {
      /*  String name ="amit";
        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(name);
        System.out.println(sb);
        if(sb.toString().equals(name)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }*/
        String name ="nitin";
        int i=0,j=name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                System.out.println("not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
