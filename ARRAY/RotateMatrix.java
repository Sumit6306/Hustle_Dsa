package DSA.ARRAY;
import java.util.Scanner;
public class RotateMatrix {
        static void transpose(int[][] matrix, int r, int c) {
            for (int i = 0; i < r; i++) {
                for (int j = i; j < c; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        static void reverse(int[] arr) {
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        static void rotate(int[][] matrix, int n) {
            transpose(matrix, n, n);

            for (int i = 0; i < n; i++) {
                reverse(matrix[i]);
            }
        }

        static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows and columns of the matrix:");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];

            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            rotate(matrix, r);

            System.out.println("Rotated Matrix:");
            printMatrix(matrix);
        }
    }



