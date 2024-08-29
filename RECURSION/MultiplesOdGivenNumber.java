package DSA.RECURSION;

import java.util.Scanner;

public class MultiplesOdGivenNumber {
    static void multiple(int n,int k){
        if (k==1){
            System.out.println(n);
            return;
        }
         multiple(n,k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int k =sc.nextInt();
        multiple(n,k);
    }
}
