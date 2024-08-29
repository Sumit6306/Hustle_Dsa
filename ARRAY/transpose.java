package DSA.ARRAY;

import java.util.Scanner;

public class transpose {
    static void printarray(int[][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
    static void transposewithoutextrarray(int[][] matrix,int r, int c){
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static int[][] findtranspose(int [][]matrix ,int r,int c){
        int [][] ans =new int[c][r];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE ROW AND COLUMN");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalelement=r*c;
        System.out.println("ENTER THE ELEMENT OF MATRIX");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
      // int [][]ans=findtranspose(matrix,r,c);
      //  printarray(ans);
        transposewithoutextrarray(matrix,r,c);
        printarray(matrix);

    }

}
