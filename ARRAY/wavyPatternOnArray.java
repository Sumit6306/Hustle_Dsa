package DSA.ARRAY;

import java.util.Scanner;

public class wavyPatternOnArray {

static void wavyArrrayOne(int [][]arr){
    int n = arr.length;
    int m = arr[0].length;

    for(int i=0;i<n;i++){
        if(i%2==0){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
        }else{
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
static void wavyArrrayTwo(int [][]arr){
    int n = arr.length;
    int m = arr[0].length;

    for(int i=0;i<n;i++){
        if(i%2==0){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");

            }
        }else{
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
static  void wavyArrrayThree(int [][]arr){
    int n = arr.length;
    int m = arr[0].length;

    for(int j =0 ;j<m;j++){
        if (j%2==0){
            for(int i = n-1; i>=0; i--){
                System.out.print(arr[i][j]+" ");
            }
        }else{
            for(int i = 0; i<n ;i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
static void wavyArrrayFour(int [][]arr){
    int n = arr.length;
    int m = arr[0].length;

    for(int j =0 ;j<m;j++){
        if (j%2==0){
            for(int i = 0; i<n; i++){
                System.out.print(arr[i][j]+" ");
            }
        }else{
            for(int i = n-1; i>=0 ;i--){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}


    static void printArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];

        for (int i = 0;i<n;i++){
            for (int j =0; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
       wavyArrrayOne(arr);
        wavyArrrayTwo(arr);
      wavyArrrayThree(arr);
        wavyArrrayFour(arr);
    }
}
