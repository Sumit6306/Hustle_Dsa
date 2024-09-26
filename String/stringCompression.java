package DSA.String;

public class stringCompression {
    public static void main(String[] args) {
       String s = "aaaabbcdeeff";
       char[] arr = s.toCharArray();
       String ans = "";
       int i =0,j=0;
       while( j < arr.length) {
           if (arr[i] == arr[j])  j++;
           else {
               ans = ans + arr[i];
               int length = j -i;
               if(length > 1) ans+= length;
               i = j;
           }

       }
        ans += arr[i];
        int length = j -i;
        if(length > 1) ans+= length;
        i = j;

        System.out.println(ans);
    }
}
