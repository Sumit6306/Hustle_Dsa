package DSA.RECURSION;

public class arrayTraversal {
    static void arrayTr(int i , int []arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        arrayTr(i+1,arr);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        arrayTr(0,arr);
    }
}
