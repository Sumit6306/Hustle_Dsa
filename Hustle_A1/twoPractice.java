package DSA.Hustle_A1;

import java.util.Scanner;

public class twoPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique value is :" + uniqueValue(arr));

    }
    static int uniqueValue(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                ans=arr[i];
            }
        }
        return ans;
    }
}
