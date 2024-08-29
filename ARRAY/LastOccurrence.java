package DSA.ARRAY;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
      // Enter the number of element
        int arr[]= new int[n];
        //Enter the value of X
        int x = 3;
        int lastelement= -1;

        System.out.println("Enter the element of array :");
        for (int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();


        }
        for (int i = 0; i< arr.length;i++){
            if (arr[i]==x){
                lastelement=i;
            }
        }
        System.out.println(arr[n]);
    }
}
