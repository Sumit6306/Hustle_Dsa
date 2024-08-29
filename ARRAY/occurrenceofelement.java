package DSA.ARRAY;

import java.util.Scanner;

public class occurrenceofelement {
    public static void  main(String [] args) {
        Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
     int arr[]= new int[n];
     int x = 2;
     int count= 0;
        System.out.println("ENTER THE ELEMENT OF ARRAY:");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0; i<arr.length;i++){
            if (arr[i]==x) {
                count++;
            }

        }
        System.out.println(count);
    }
}
