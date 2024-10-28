package DSA.RECURSION;

import java.util.Scanner;

public class generateTheBinaryNumber {
    static void binaryNgenerate(String s,int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return ;
        }
        if(m==0||s.charAt(m-1)=='0'){
            binaryNgenerate(s+1,n) ;
            binaryNgenerate(s+0,n) ;
        }
        else binaryNgenerate(s+0,n) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        binaryNgenerate("",n);
    }
}
