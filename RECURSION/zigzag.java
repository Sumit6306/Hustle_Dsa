package DSA.RECURSION;

import java.util.Scanner;

public class zigzag {
    static void nZigZag(int n){
        if(n==0) return ;
        System.out.print(n);
        nZigZag(n-1);
        System.out.print(n);
        nZigZag(n-1);
        System.out.print(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        nZigZag(n);
    }
}
