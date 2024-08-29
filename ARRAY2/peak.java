package DSA.ARRAY2;
import  java.util.*;
public class peak {


        static void peakElement(int[] arr)
        {
            int m= arr.length;


            for(int i=0;i<m;i++){
                if(arr[i]==0||arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                    System.out.println(arr[i]);
                }

            }
        }
        public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int[] arr =new int[n];
        int m=arr.length;


        for(int i=0;i<=m;i++){
            arr[i]= sc.nextInt();
        }
    peakElement(arr);


    }


    }


