package DSA.ARRAY2;

public class occurence {

        static int frequency(int[] arr, int N, int X) {
            int res = 0;
            for (int i = 0; i <= N; i++) {
                if (X == arr[i]) {
                }
                res++;


            }
            return res;
        }
        public static void main(String[] args)
        {
            int[] arr = {1,1,1,1,1};
            int N = arr.length;
            int X= 2;
            System.out.println(frequency(arr, N, X));
        }
    }

