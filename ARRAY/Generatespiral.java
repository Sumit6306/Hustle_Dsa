package DSA.ARRAY;
import java.util.Scanner;

public class Generatespiral {
    static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralGenerate(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftColumn = n - 1, rightColumn = 0;
        int curr = 1;

        while (curr <= n * n) {
            // Traverse top row
            for (int j = leftColumn; j <= rightColumn && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;
            }
            topRow++;

            // Traverse right column
            for (int i = topRow; i <= bottomRow && curr < n * n; i++) {
                matrix[i][rightColumn] = curr++;
            }
            rightColumn--;

            // Traverse bottom row
            for (int j = rightColumn; j >= leftColumn && curr < n * n; j--) {
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            // Traverse left column
            for (int i = bottomRow; i >= topRow && curr < n * n; i--) {
                matrix[i][leftColumn] = curr++;
            }
            leftColumn++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[][] hey = spiralGenerate(n);
        printArray(hey);
    }
}
