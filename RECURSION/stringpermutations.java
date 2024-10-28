package DSA.RECURSION;

public class stringpermutations {
    static void permutations(String str,String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
       String  left = str.substring(0,i);
       String rigth = str.substring(i+1);
       permutations(left+rigth,ans+ch);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permutations(s,"");

    }
}
