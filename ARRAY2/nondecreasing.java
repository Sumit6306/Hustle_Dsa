package DSA.ARRAY2;

import java.util.*;

import java.util.*;

class NonDecreasing {
    static int[] nonDecreasingSort(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                k++;
                right--;
            }

        }
        return ans;
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr,i,j);
            i++;
            j--;

        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = nonDecreasingSort(arr);
        reverse(ans);
        System.out.println("SORTED ARRAY");
        printArray(ans);
    }
}
