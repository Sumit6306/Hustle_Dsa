package DSA.ARRAY;

import java.util.Scanner;

public class additionofmatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE ROW AND  COLUMN OF MATRIX");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];


        System.out.println("ENTER THE VALUES OF MATRIX");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("ENTER THE ROW AND COLUMN OF MATRIX");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int  [][] b=new int[r2][c2];

        System.out.println("ENTER THE VALUES OF MATRIX");
        for (int i=0;i<r2;i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();


            }
        }
        System.out.println("MATRIX A");
        printmatrix(a);
        System.out.println("MATRIX B");
        printmatrix(b);
        System.out.println("SUM OF MATRIX");
        add(a,r1,c1,b,r2,c2);

    }

    static void add(int [][]a, int r1 , int c1,int [][] b,int r2,int c2){
        if (r1!=r2||c1!=c2){
            System.out.println("INVAILAD OUTPUT");
            return;
        }
        int [][] ans =new int[r1][c1];

        for (int i=0;i<r1;i++) {
            for (int j = 0; j < c1; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
            printmatrix(ans);


    }
    static void printmatrix(int [][] matrix) {
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


}
