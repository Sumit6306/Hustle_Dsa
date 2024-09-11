package DSA.ARRAY;

public class nextGreatestElement {
    static void greatestElement(int [] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;


        int nge = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(arr[i], nge);
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for(int j: ans ){
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {12,8,60,37,2,49,16,20,21,5};
        greatestElement(arr);

    }
}
