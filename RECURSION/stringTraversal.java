package DSA.RECURSION;

public class stringTraversal {
    static void stringTr(String s,int i){
        if(i== s.length()) return;
        System.out.print(s.charAt(i));
        stringTr(s,i+1);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        stringTr(s, 0);
    }
}
