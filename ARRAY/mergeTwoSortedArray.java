package DSA.ARRAY;
public class mergeTwoSortedArray {

    static void mergeSortedArray(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
            if (j == b.length) {
                while (i < b.length) {
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }

        }
    }
    static void mergeFromLastIndexOfArray(int[] a, int[] b, int[] c) {
int i = a.length-1;
int j = b.length-1;
int k = c.length-1;
while( i >= 0 &&  j >= 0){
    if (a[i] >= b[j]){
        c[k]=a[i];
        i--;
    }else {
        c[k]=b[j];
        j--;
    }
    k--;

        while (i>=0){
            c[k]=a[i];
            i--;
            k--;
        }


        while (j>=0){
            c[k]=b[j];
            j--;
            k--;
        }



}
    }

    static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

        public static void main (String[]args){
            int[] a = {11, 33, 42, 56, 71};
            int[] b = {26, 54, 69, 86, 81};
            int[] c = new int[a.length + b.length];
           // mergeSortedArray(a, b, c);
            mergeFromLastIndexOfArray(a, b, c);
            printArray(c);

        }
    }


