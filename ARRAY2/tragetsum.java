package DSA.ARRAY2;

import java.util.Scanner;

public class tragetsum {
    static int pairsum(int[] arr,int target) {
        int n= arr.length;
        int ans = 0;

        for (int i = 0; i <n; i++) {
            for (int j = i + 1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENT");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("ENTER THE ELEMENT OF ARRAY");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER TARGET NUMBER");
        int target=sc.nextInt();

        System.out.println(pairsum(arr,target));
    }

}