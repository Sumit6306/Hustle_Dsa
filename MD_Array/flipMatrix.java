package DSA.MD_Array;

import java.util.Scanner;

public class flipMatrix {
    static int matrixScore(int[][] arr) {

        // Putting 1 at index 0 of row
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }

            }
        }
//COunting the numbeer of zeros and ones
        for (int j = 1; j < arr[0].length; j++) {
            int noOfZero = 0;
            int noOfOnes = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 0) noOfZero++;
                else noOfOnes++;
            }

            if (noOfZero > noOfOnes) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }
        //Binary addition
        int score = 0;
        int x = 1;
        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }

        return score;
    }

static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        matrixScore(matrix);
        printMatrix(matrix);
    }

}

