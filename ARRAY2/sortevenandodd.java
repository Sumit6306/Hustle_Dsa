package DSA.ARRAY2;

import java.util.Scanner;

public class sortevenandodd {
    static void evenodd(int[] arr) {
        int n = arr.length;
        int right = n-1;
        int left=0;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right]%2== 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]%2 == 0) {
                left++;
            }
            if (arr[right] %2==1) {
                right--;
            }
        }
    }
    static void printarry(int []arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr ,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENT");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("ENTER THE ELEMENT OF ARRAY");
        for (int i= 0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        evenodd(arr);
        System.out.println("SORTED ARRAY");
        printarry(arr);
    }
}


