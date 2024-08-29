package DSA.ARRAY2;

import java.util.Scanner;
public class sortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        checksortedornot(arr);
    }

    static void checksortedornot(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; i++) {
                if (arr[i] > arr[j]) {
                    System.out.println("SORTED");

                } else {
                    System.out.println("UNSORTED");
                }
            }
        }
    }
}