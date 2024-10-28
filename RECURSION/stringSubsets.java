package DSA.RECURSION;

public class stringSubsets {
    static void subsets(int i ,String s,String ans ) {
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        subsets(i+1,s,ans + ch);
        subsets(i+1,s,ans );

    }

    public static void main(String[] args) {
        String s = "sumit";
        subsets(0,s,"");
    }
}
