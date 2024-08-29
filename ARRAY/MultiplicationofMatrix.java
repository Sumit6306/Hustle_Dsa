package DSA.ARRAY;

import java.util.Scanner;

public class MultiplicationofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ROWS AND COULUMN");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];


        System.out.println("ENTER THE VALUE OF MATRIX");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER THE ROWS AND COULUMN");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];


        System.out.println("ENTER THE VALUE OF MATRIX");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();

            }
        }

        System.out.println("MATRIX A");
        Printmatrix(a);
        System.out.println("MATRIX B");
        Printmatrix(b);
        System.out.println("MULTIPLIACTION OF MATRIX");
        multiplication(a,r1,c1,b,r2,c2);

    }
    static void multiplication(int [][] a,int r1, int c1 ,int [][] b, int r2, int c2){
        if (c1!=r2){
            System.out.println("Envaild Input");
            return ;
        }
        int[][] ans=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;i<c2;i++){
                for (int k=0;k<c1;k++){
                     ans[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        Printmatrix(ans);
    }
    static void Printmatrix(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;i++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}