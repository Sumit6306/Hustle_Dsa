package DSA.MD_Array;
import java.util.Scanner;

public class matrixMultiplication {
    static void multiplicationOfMatrix(int[][] arr1, int[][] arr2, int[][] result) {
        
        if (arr1[0].length!= arr2.length) {
            System.out.println("Please enter the correct dimensions of the matrices.");
        } else {
            for (int i = 0; i <arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k <  arr1[0].length; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of the first matrix (rows and columns):");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Size of the second matrix (rows and columns):");
        int p = sc.nextInt();
        int q = sc.nextInt();
        if (m != p) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int[][] arr2 = new int[p][q];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[n][q];
        multiplicationOfMatrix(arr1, arr2, result);

        System.out.println("Resultant matrix after multiplication:");
        printMatrix(result);
    }
}
