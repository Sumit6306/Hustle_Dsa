package DSA.ARRAY2;

import java.util.Scanner;

public class zeroandone {
    static void zeroandonssort(int[] arr) {
        int n = arr.length;
        int ans = 0;


        for (int i = 0; i<n; i++) {
            if (arr[i] == 0) {
                ans++;

            }
        }
        for (int i=0;i<n;i++){
            if (i<ans){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    static void printarry(int []arr){
        int n =arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENT");
        int n= sc.nextInt();
        int[]arr= new int[n];


        System.out.println("ENTER THE ELEMENT OF ARRAY");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
   zeroandonssort(arr);
        System.out.println("SORTED ARRAY");
        printarry(arr);


    }
}
