package DSA.RECURSION;

import java.util.Scanner;

public class stringPalindrome {
    static String reverseStr(String str,int idx ) {

        if(idx == str.length()) return "";

        String smallAns = reverseStr(str,idx+1);

        return smallAns + str.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s= sc.nextLine();

        String rev =  reverseStr(s, 0);

        if(rev.equals(s)){
            System.out.println("YES PALINDROME :" + s);
        }else{
            System.out.println("NOT A PALINDROME: " + s);
        }
    }
}
