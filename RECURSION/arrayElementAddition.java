package DSA.RECURSION;

public class arrayElementAddition {
    static int sumOfElement(int[]arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];  // BASE CASE :-" if (idx==arr.length) return 0;" we can also write this
        }
        int smallAns= sumOfElement(arr,idx+1);
        return smallAns+arr[idx];
    }

    public static void main(String[] args) {
        int []arr={4,5,3,4,1};
        System.out.println (sumOfElement(arr,0));
    }
}
