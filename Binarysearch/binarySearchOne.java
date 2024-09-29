package DSA.Binarysearch;

public class binarySearchOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 60;
        int n = arr.length;
        int lo = 0, hi = n - 1;
        boolean found = false;

        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if(arr[mid] == target) {
                found = true;
                break;
            }
            else if(arr[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        if(found==true) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
