package DSA.RECURSION;

import java.util.Scanner;

public class stairpath {
    static int countedStair(int n ){
        if(n <= 2) return n ;
        return nstairpath(n-1)+ nstairpath(n-3);
    }
    static int nstairpath(int n){
        if(n<=2) return n;
        return nstairpath(n-1)+ nstairpath(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairpaths: ");
        int n = sc.nextInt();
       // System.out.println(nstairpath(n));
        System.out.println(countedStair(n));
    }
}
