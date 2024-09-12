package DSA.MD_Array;

import java.util.Scanner;

public class sumOfElement {
    static void sumofE(int [][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int sum =0;
        for(int i=0 ; i<n;i++){
            for(int j=0 ; j<m;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Enter the sum of Elements in Array :" + sum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column number");
       int n = sc.nextInt();
       int m = sc.nextInt();
       int [][]arr = new int[n][m];

       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               arr[i][j] = sc.nextInt();
           }
        }
       sumofE(arr);
    }
}
