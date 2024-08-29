package DSA.ARRAY;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int ans= 0;

        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<arr.length;i++){
                if (arr[i]>ans){
                    ans=arr[i];
            }
        }
        System.out.println(ans);

    }
}
