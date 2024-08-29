package DSA.RECURSION;

public class arrayTarget {


    static int indexTarget(int []arr,int idx,int target){
        if (arr[idx] > arr.length) return -1;
        if (arr[idx]==target) return idx;
        return indexTarget(arr,idx+1,target);
    }
    static boolean target(int []arr,int idx,int target){
        if(idx==arr.length) return false;
        if(arr[idx]==target) return true;
//         if(target(arr,idx+1,target)){
//             return true;
//         }else{                     /*This is a Boolean method that always return true or false */
//             return false;
//         }
        return target(arr,idx+1,target) ; /* it always return Boolean type */
    }

    public static void main(String[] args) {
        int arr []= {4,8,3,6,1,3};
        System.out.println(target(arr,0,40));
        System.out.println(indexTarget(arr,0,5));
    }
}
