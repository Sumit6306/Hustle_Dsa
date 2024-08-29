package DSA.ARRAY2;

import java.util.Scanner;

public class suffixsum {
static int [] Sumsuffix(int []arr){
    int n = arr.length;
    int[] Suffixsum=new int[n];
 Suffixsum[n-1]=arr[n-1];

    for(int i=n-2;i>=0;i--){
        Suffixsum[i]=arr[i]+Suffixsum[i+1];
    }
    return Suffixsum;
}
static void printarray(int []arr){
    int n=arr.length;
    for (int i=0;i<n;i++){
        System.out.print(arr[i] +" ");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=Sumsuffix(arr);
        printarray(ans);
    }
}
