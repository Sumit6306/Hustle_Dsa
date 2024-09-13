package DSA.MD_Array;

import java.util.Scanner;

public class transposeOfMatrix {
    static void  transposeMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]ans = new int [m][n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        transposeMatrix(array);



    }
}
