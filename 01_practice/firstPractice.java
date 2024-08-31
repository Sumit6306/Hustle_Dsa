package DSA.Practice;

import java.util.ArrayList;
public class firstPractice{


static ArrayList<Integer> allIndices(int[] arr, int target, int idx) {
        if (idx >= arr.length) return new ArrayList<Integer>();//return empty array
        ArrayList<Integer> small = new ArrayList<>();
        if (arr[idx] == target) {
            small.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(arr, target, idx + 1);
        small.addAll(smallAns);

        return small;
    }
    static void findTarget(int[] a, int x, int idx) {
        if (idx >= a.length) return;

        if (a[idx] == x) {
            System.out.println(idx);
        }
        findTarget(a, x, idx + 1);
    }
    static void targetValue(int[] arr) {
        int x = 6;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
    static void maxElement(int[] arr) {
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }


        System.out.println("Maximum element: " + ans);
    }
    static void arrayElementSum(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        System.out.println("Sum of array elements: " + ans);

    }


    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6, 3, 7, 3, 8};
        int x= 3;
        // arrayElementSum(arr);
        //maxElement(arr);
        //targetValue(arr);
        //findTarget(arr,x , 0);
//     ArrayList <Integer> small =allIndices(arr,target,0);
//      for (Integer i:small){
//          System.out.println(i);
//   }


    }

}

