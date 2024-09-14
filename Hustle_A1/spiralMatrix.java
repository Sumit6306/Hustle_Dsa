package DSA.Hustle_A1;

import java.util.Scanner;

public class spiralMatrix {
    static void matrixSpriral(int [][]arr){
        int minrow= 0; int maxrow=arr.length-1;
        int mincol=0; int maxcol=arr[0].length-1;

        while(minrow <= maxrow && mincol <= maxcol) {

            for (int j = mincol; j <= maxcol; j++) {
                System.out.print(arr[minrow][j]+" ");

            }
            minrow++;
            if (minrow > maxrow || mincol > maxcol) break;
            for (int i = minrow; i <= maxrow; i++) {
                System.out.print(arr[i][maxcol]+" ");
            }

            maxcol--;
            if (minrow > maxrow || mincol > maxcol) break;
            for (int j = maxcol; j >= mincol; j--) {
                System.out.print(arr[maxrow][j] + " ");
            }
            maxrow--;
            if(minrow>maxrow || mincol>maxcol) break;
            for (int i = maxrow; i >= minrow; i--) {
                System.out.print(arr[i][mincol] + " ");
            }
            mincol++;
        }

    }


    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("Enter the element of array");
        for(int  i= 0; i<n ;i++){
            for(int j =0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
matrixSpriral(matrix);

    }
}
