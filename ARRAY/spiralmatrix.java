package DSA.ARRAY;

import java.util.Scanner;

public class spiralmatrix {
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }

        }
    }
    static void matrixSprial(int[][]matrix,int r,int c){
        int topRow=0;int bottomRow=r-1; int leftColumn=0;int rightColumn=c-1;
        int totalElement=0;
        while(totalElement<r*c){
//                        toprow
            for (int j=leftColumn;j<=rightColumn && totalElement<r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;
//                   rightColumn
            for (int  i=topRow;i<=bottomRow && totalElement<r*c;i++){
                System.out.print(matrix[i][rightColumn]+" ");
                totalElement++;
            }
            rightColumn--;
            //        bottomRow
            for (int j=rightColumn;j>=leftColumn && totalElement<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            // leftcolumn
            for (int i=bottomRow;i>=topRow && totalElement<r*c;i--){
                System.out.print(matrix[i][leftColumn]+" ");
                totalElement++;
            }
            leftColumn++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ROW AND COLUMN");
        int r= sc.nextInt();
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];

        System.out.println("ENTER THE ELEMENTS");
        for (int i=0; i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        System.out.println("ORIGINAL MATRIX:");
        printMatrix(matrix);


        System.out.println("SPIRAL MATRIX:");
        matrixSprial(matrix,r,c);
    }
}
