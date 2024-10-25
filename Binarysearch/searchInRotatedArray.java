package DSA.Binarysearch;

public class searchInRotatedArray {
    static int bs(int[] arr,int target,int lo,int hi){
        while(lo<=hi){
            int mid= lo +(hi- lo)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                hi= mid-1;
            }else lo = mid+1;

        }
return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 7;
        int n = arr.length;
         int lo =0, hi = n-1;
         int p =-1;
         while(lo<=hi){
             int mid = lo+(hi-lo)/2;

             if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                 p = mid;
                 break;
             }else if (arr[mid]<arr[mid+1]&&arr[mid]<arr[mid-1]){
                 p = mid+1;
                 break;
             }else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                 if(arr[mid]>arr[n-1])lo=mid+1;
                 else hi=mid-1;
             }
             int bs = bs(arr,target,0,n-1);
             if(bs!=-1){

             }
         }


         }
    }

