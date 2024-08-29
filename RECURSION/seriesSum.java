package DSA.RECURSION;


import java.util.Scanner;

public class seriesSum {
    static int negPosSeriesSum(int n){
        if(n==0){
            return 0;
        }
        if (n%2==0){
            return negPosSeriesSum(n-1) - n;
        }else {
            return negPosSeriesSum(n-1) + n;
        }
    }

    // Question is basically for Practice
    static int sumNum(int n){
        //base case
        if (n==0) return 0;
        return sumNum(n-1) + n ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  System.out.println(sumNum(n));
        System.out.println(negPosSeriesSum(n));
    }
}
