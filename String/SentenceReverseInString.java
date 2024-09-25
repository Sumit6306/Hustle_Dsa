package DSA.String;

import java.util.Scanner;

public class SentenceReverseInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder Sb = new StringBuilder(sc.nextLine());
        int n = Sb.length();
        int i = 0;
        int j = 0;

        while(j < n){
            if(Sb.charAt(j) != ' ') j++;
            else{
                reverseString(Sb,i,j-1);
                i = j+1;
                j = i;
            }
        }
        reverseString(Sb,i,j-1);
        System.out.println(Sb);

    }

    static void reverseString(StringBuilder Sb, int i, int j) {
        while (i < j) {
            char temp = Sb.charAt(i);
            Sb.setCharAt(i, Sb.charAt(j));
            Sb.setCharAt(j, temp);
            i++;
            j--;
        }

    }
}