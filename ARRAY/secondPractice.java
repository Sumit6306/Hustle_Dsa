package DSA.ARRAY;

import java.util.Scanner;

public class secondPractice {



    static boolean checkSorted(int []arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    static int strictlyGreater(int []arr,int x){
           int count =0;
           for (int i =0; i<arr.length;i++){
               if (arr[i]> x){
                   count++;
               }
           }
           return count;
       }
    static int lastOccurence(int []arr , int x){
        int lastidx=-1;
        for (int i =0; i<arr.length;i++){
            if (arr[i]==x){
                lastidx=i;

            }
        }
        return lastidx;
    }
    static int countOccurence(int [] arr,int x){
        int count=0;
        for (int i =0; i <= arr.length-1;i++){
            if (arr[i]==x){
                count++;
                    }
                }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("ENTER THE NUMBER OF ELEMENT");
         int n =sc.nextInt();
         int[] arr= new int[n];

        System.out.println("ENTER ELEMENT");
        for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("TARGET VALUE");
//        int x = sc.nextInt();

       // System.out.println("Occurence:"+ countOccurence(arr,x));
       // System.out.println("Last Occurence :"+ lastOccurence(arr,x));
       // System.out.println("Greater than X : "  + strictlyGreater(arr,x) );
        //System.out.println("CHECK:"+ checkSorted(arr));
    }
}
