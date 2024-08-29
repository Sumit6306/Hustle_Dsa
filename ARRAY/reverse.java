package DSA.ARRAY;

public  class reverse {

    public static int[] reverseofarray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        // traversing of array
        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;


        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = reverseofarray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}


