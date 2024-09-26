package DSA.String;

public class findMax {
    public static void main(String[] args) {
        String [] arr = {"455","746745","56254","64645646464564"};
       String mx = arr[0];
        for(int i=1;i<arr.length;i++){
            mx = max(mx,arr[i]);

        }
        System.out.println(mx);



    }
   public static String max(String a, String b) {
        String s = clean(a), t = clean(b);
        if (s.length() >= t.length()) return a;
        if (t.length() >= s.length()) return b;
        for (int i = 0; i < a.length(); i++) {
                if (t.charAt(i) != s.charAt(i)){
                    if(s.charAt(i) >= t.charAt(i)) return a;
                    else return b;
                }
            }
            if(a.length() >= t.length()) return a;
            else return b;
    }

   public static String clean(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') return a.substring(i);
        }
        return a;
    }
}
