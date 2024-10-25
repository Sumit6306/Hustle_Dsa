package DSA.RECURSION;

public class skipChar {
    static void skip(String s ,String ans ,int i ){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }

        if(s.charAt(i) != 'a') ans += s.charAt(i);
       skip(s,ans,i+1);
    }

    public static void main(String[] args) {
        String s = "abcadbcaadb";
        skip(s," ",0);
    }
}
