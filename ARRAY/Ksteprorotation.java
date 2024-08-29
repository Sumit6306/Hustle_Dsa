package DSA.ARRAY;


import java.util.Scanner;

public class Ksteprorotation {
    static int[] rotation(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;


        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr) {

       for (int j=0;j<arr.length;j++){
           System.out.print(arr[j]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER THE NUMBER OF ROTATIONS");
        int k = sc.nextInt();

        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = rotation(arr, k);
        printArray(ans);
    }
}