package DSA.ARRAY;

import java.util.Scanner;

public class reverseArray {
static void reverse (int [] arr) {
      for (int i = 0; i < arr.length / 2; i++) {
              int temp = arr[i];
              arr[i] = arr[arr.length-1-i];
             arr[arr.length-1-i]= temp;
          }
      }
      static void tpReverse (int [] arr) {
    int i=0;
    int j=arr.length-1;
  while(i<=j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
  }
}


static void printArray(int[]arr){
    for(int i = 0; i< arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int [] arr = new int[n];

    System.out.println("Enter the elements of the array");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    tpReverse(arr);
    System.out.println("Reversed Array");
   printArray(arr);

}
}
