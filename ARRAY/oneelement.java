package DSA.ARRAY;

import java.util.Scanner;

public class oneelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];

       int ans =0;


        for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i=0; i<arr.length;i++){
            if (arr[i] != -1){
                ans=arr[i];

            }
        }
        System.out.println(ans);




    }

}
