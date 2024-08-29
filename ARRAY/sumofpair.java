package DSA.ARRAY;

import java.util.Scanner;

public class sumofpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int target=7;
        int ans = 0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();


        }
        for (int i =0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
