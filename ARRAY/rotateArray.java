package DSA.ARRAY;

import java.util.Scanner;

public class rotateArray {
    static int []rotateAnArray(int []arr,int k){
        int n = arr.length;
        k=k%n;
        int j =0;
        int [] ans = new int[n];
        for (int i = n-k; i < n; i++){
          ans[j++]=arr[i];
        }
        for (int i =0; i < n-k; i++){
            ans[j++]=arr[i];
        }

         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        int [] ans = rotateAnArray(arr,k);
        for (int arrAns: ans) {
            System.out.print(arrAns+" ");
        }
    }
}
