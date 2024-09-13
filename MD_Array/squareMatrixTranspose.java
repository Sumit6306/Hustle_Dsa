package DSA.MD_Array;

import java.util.Scanner;

public class squareMatrixTranspose {
    static void transformMatrixToTranspose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0; i<n;i++){
            for(int j =0;j<=i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            System.out.println();
        }

    }
    static void printMatrix(int[][] matrix) {
        for(int i =0; i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println();
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
        transformMatrixToTranspose(array);
        printMatrix(array);


    }
}
