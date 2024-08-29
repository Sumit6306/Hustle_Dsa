package DSA.RECURSION;
import java.util.*;
import java.math.*;

public class maxInArray {
    static int  max(int []arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int smallMax= max(arr, idx+1);
                return Math.max(smallMax,arr[idx]);
    }

    public static void main(String[] args) {
        int []arr={3,5,7,2,9};
        System.out.println(max(arr,0));
    }
}
