package DSA.AdavanceSortingAlgo;

import java.util.Scanner;

public class mergeSort {
    static void mergesortArray(int [] a, int []b,int [] c){

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i < a.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        if(j<b.length){
                while (i < b.length) {
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }

        }

    }
    static void printArray(int [] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void mergesortAlgo(int[] arr){
        int n = arr.length;
        if(n == 1) return ;
        int [] a = new int [n/2];
        int [] b = new int [n - n/2];

        for(int i = 0; i<n/2; i++){
            a[i]= arr[i];
        }
        for(int i=0 ; i<n-n/2; i++){
            b[i]= arr[i+n/2];
        }
        mergesortAlgo(a);
        mergesortAlgo(b);
mergesortArray(a,b,arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter th Element of Array");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
       mergesortAlgo(arr);
        printArray(arr);

    }
}
