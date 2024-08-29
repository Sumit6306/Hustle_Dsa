package DSA.ARRAY2;

import java.util.Scanner;

public class smallestandlargest {
    static void smallestlargest(int[]arr) {
        int largest = arr[0];
        int smallest = arr[0];
        int n =arr.length;

        for (int i=0;i<n;i++){
            for(int j=i+1;i<n;i++){
                if (arr[i]>arr[j]){
                    largest=arr[i];
                }
                if (arr[i]<arr[j]){
                    smallest=arr[i];
                }


            }
            System.out.println(largest);
            System.out.println(smallest);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER OF ELEMENT");
        int n= sc.nextInt();
        int [] arr= new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

      smallestlargest(arr);


    }


}
