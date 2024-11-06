package DSA.String;

public class stringc {

    public static void main(String[] args) {
        String s = "aabbbbbb";
        String ans = "" ;
        char [] arr =s.toCharArray();
        int i =0;
        int j = 0;
        while(j < arr.length){
            if(arr[i]== arr[j]) j++;
            else{
                ans += arr[i];
                int len = j-i;
                if(len > 1) ans += len ;
                i = j;
            }

        }
        ans += arr[i];
        int len = j-i;
        if(len > 1) ans += len ;
        i = j;
        System.out.println(ans);

    }
}
