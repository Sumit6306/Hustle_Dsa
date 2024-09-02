package DSA.Hustle_A1;

import java.util.Scanner;

public class twoPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Element");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println("Unique value is :" + uniqueValue(arr));
        //System.out.println("Maximum value of array" + mxValue(arr));
        //System.out.println("Second max value :" + secondMax(arr));
        System.out.println("First repeated value is :" + firstRepeatValue(arr));

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
        for (int j : arr) {
            if (j > 0) {
                ans = j;
            }
        }
        return ans;
    }
    static int mxValue(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondMax(int[] arr) {
        int sMx= mxValue(arr);
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == sMx){
                 arr[i]= Integer.MIN_VALUE;
             }
         }
        int secondMax = mxValue(arr);
         return secondMax;
    }//For second max we have to find max value
    static int firstRepeatValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return  arr[i];
                }
            }
        }
        return -1;
    }

}
