package DSA.Hustle_A1;

import java.util.Scanner;

public class onePractice {


    static int tripletSum(int [] arr , int x ){
        int ans =0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
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
        //System.out.println("Pair sum is :");
        //System.out.print(pairSum(arr,x));
        System.out.println("Triplet sum is :");
        System.out.println(tripletSum(arr,x));
    }
}