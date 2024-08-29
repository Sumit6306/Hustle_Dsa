package DSA.RECURSION;

public class implementationOfArray {
    static void arrayRecursion(int[]arr,int index){
        if(index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        arrayRecursion(arr,index+1);
    }

    public static void main(String[] args) {
        int []arr={1,2,4,7,8};
        arrayRecursion(arr,0);
    }
}
