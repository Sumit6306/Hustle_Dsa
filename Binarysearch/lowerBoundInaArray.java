package DSA.Binarysearch;

public class lowerBoundInaArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 47,47, 50, 60, 70, 80, 90};
        int target = 40;
        int n = arr.length;
        int lb= n;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(lb);
    }
}
