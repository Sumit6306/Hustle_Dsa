package DSA.MD_Array;

import java.util.Scanner;

public class sumofAllElement {
    static void sumofToMatrix(int[][] arr, int[][] arr2) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[row][col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Size of First Array :");
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] arr = new int[row][col];
            System.out.println("Enter the Elements of Array:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Size of First Array :");
            int row2 = sc.nextInt();
            int col2 = sc.nextInt();
            int[][] arr2 = new int[row2][col2];
            System.out.println("Size of second Array:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            sumofToMatrix(arr, arr2);

        }

}