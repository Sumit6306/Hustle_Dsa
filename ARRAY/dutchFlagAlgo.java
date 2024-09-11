package DSA.ARRAY;

import java.util.Scanner;

public class dutchFlagAlgo {
    static void SortZeroOnesTwos(int[]arr){
        int n = arr.length;
        int numberOfZeros = 0 ;
        int numberOfOnes = 0 ;

        for(int i =0; i<n ; i++){
            if (arr[i]==0) numberOfZeros++;
            if (arr[i]==1) numberOfOnes++;
        }

        for(int i=0; i < n; i++) {
            if (i < numberOfZeros) arr[i]=0;
           else if(i< numberOfZeros+numberOfOnes) arr[i]=1;
            else arr[i]=2;
        }


    }
    static void printArray(int []arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SortZeroOnesTwos(arr);
        System.out.println("Sorted array");
        printArray(arr);

        }
    }

