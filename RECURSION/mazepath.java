package DSA.RECURSION;

import java.util.Scanner;

public class mazepath {
    static int mazePathf(int row ,int col,int m ,int n){
        if(row==m || col == n) return 1;
        int rightWays= mazePathf(row,col+1,m,n);
        int downWays= mazePathf(row+1,col,m,n);
        return rightWays + downWays;
    }
    static int mazepathtwo(int m , int n ){
        if(m == 1|| n ==1) return 1;
        int rightWays = mazepathtwo(m,n-1);
        int downWays = mazepathtwo(m-1,n);
        return rightWays + downWays ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row :");
        int m = sc.nextInt();
        System.out.println("Enter the col :");
        int n = sc.nextInt();
       // System.out.println(mazePathf(0,0,m-1,n-1));
        System.out.println(mazepathtwo(m,n));
    }
}
