package DSA.ARRAY;

import java.util.Arrays;

public class Maxofarray {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7,10};
        int ans = 0;
        for (int i= 0; i<arr.length;i++){
            if (arr[i]>ans){
                ans = arr[i];

            }

        }
        System.out.println("MAXIMUM OF ARRAY :" + ans);
    }
}
