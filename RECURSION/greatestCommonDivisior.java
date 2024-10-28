package DSA.RECURSION;

import java.util.Scanner;

public class greatestCommonDivisior {
    static int gcd (int a ,int b){
        if(b%a==0) return  a;
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Your Greatest common Divisior is : "+gcd(a,b));



    }
}
