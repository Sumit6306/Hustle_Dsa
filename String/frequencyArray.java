package DSA.String;

import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [ ] ans =  new int [26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (int)ch-97;
            ans[idx]++;
        }
        int max = -1;
        for (int i = 0; i < 26; i++) {
             max = Math.max(max , ans[i]);

        }
        for (int i = 0; i < 26; i++) {
            if(ans [i] == max ) {
                char ch = (char) (i + 97);
                System.out.print(ch);
            }
        }

    }
}
