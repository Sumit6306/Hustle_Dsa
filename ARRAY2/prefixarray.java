package DSA.ARRAY2;

import java.util.Scanner;

public class prefixarray {
    static  int []prefix(int []arr){
      int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    static void printarray(int[]arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("ENTER THE NUMBER OF ELEMENT");
        int n =sc.nextInt();
        int[]arr=new int[n+1];

        System.out.println("ENTER THE ELEMENT OF ARRAY");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }

        int[] prefix= prefix(arr);
        System.out.println("ENTER THE NUMBER OF QERIES");
        int q=sc.nextInt();
        while(q-->0) {
            System.out.println("ENTER THE RANGE");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans  = prefix[r] - prefix[l - 1];
            System.out.println(ans);
        }

    }
}
