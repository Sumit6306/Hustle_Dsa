package DSA.RECURSION;

import java.util.Scanner;

public class GCD {
    static int greatestCommonFactor(int x,int y){
        while (x%y!=0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    static  int  EuclidGcd(int x,int y){
        if (y==0){
            return x;                        // Euclid Algorithm is very important in Recursion
        }
        return EuclidGcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(greatestCommonFactor(x,y));
        System.out.println(EuclidGcd(x,y));
    }
}
