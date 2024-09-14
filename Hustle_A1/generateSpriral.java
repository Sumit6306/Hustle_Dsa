package DSA.Hustle_A1;

import java.util.Scanner;

public class generateSpriral {
    static int[][] generateSpriral(int n) {
        int r1 = 0; int r2 = n-1;
        int c1 = 0; int c2 = n-1;
        int num = 1;
        int [][] ans = new int[n][n];
        while (r1<=r2 && c1<=c2){
            for (int j = c1; j<=c2; j++) ans[r1][j] = num++;
            r1++;
            for(int i = r1; i<=r2; i++) ans[i][c2] = num++;
            c2--;

            if(r1<=r2 && c1<=c2){
                for ( int j = c2; j>=c1; j--) ans[r2][j] = num++;
                r2--;
                for(int i = r2; i>=r1; i--) ans[i][c1] = num++;
                c1++;
            }
        }
        return ans ;
    }
static void printArray(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of element ");
        int n = sc.nextInt();
        int [][] sp = generateSpriral(n);
printArray(sp);



    }
}
