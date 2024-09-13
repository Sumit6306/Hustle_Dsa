package DSA.MD_Array;

import java.util.Scanner;

public class rotateArray {

    static void arrayRotate(int [][] arr){
        int n= arr.length;
//swap the array
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
//reverse the array
        for(int i=0;i<n;i++){
            int a =0;
            int b=arr.length-1;
            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }




    }
static void printArray(int[][]arr){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j < arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
          arrayRotate(arr);
        printArray(arr);
    }
}
