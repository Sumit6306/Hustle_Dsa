package DSA.Binarysearch;

public class upperBoundOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 47,47, 50, 60, 70, 80, 90};
        int n = arr.length;
        int x = 30;
        int ub = n;
        int lo = 0,hi = n-1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > x) {
                ub=Math.min(ub, mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(ub);

    }
}
