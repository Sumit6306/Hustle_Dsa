package DSA.ARRAY;

import java.util.Scanner;

public class triplepair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] = new int[m];
        int target = 12;
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                for(int k = j+1; k<n;k++){
                    if(arr[i] + arr[j] + arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}