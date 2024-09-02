package DSA.RECURSION;

import java.util.Scanner;

public class recursionString {
    static String reverseS(String str, int idx) {
        // base case
        if (idx == str.length()) return " ";
        String ans = reverseS(str, idx + 1);
         return ans +str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseS(s,0));
    }

}
