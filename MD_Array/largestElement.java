package DSA.MD_Array;

import java.util.Scanner;

public class largestElement {
    static void largestElements(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i< n ; i++){
            for(int j = 0; j < m ;j++){
                mx= Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Rows and Column of Array");
        int n = sc.nextInt();
        int m= sc.nextInt();
        int [][] arr = new int [n][m];

        System.out.println("Enter the elements of Array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        largestElements(arr);
    }
}
