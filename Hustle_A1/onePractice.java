package DSA.Hustle_A1;

import java.util.Scanner;

public class onePractice {
    static int pairSum(int[] arr, int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        System.out.println("Pair sum is :");
        System.out.print(pairSum(arr,x));
    }
}