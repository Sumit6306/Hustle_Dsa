package DSA.String;

import java.util.Scanner;

public class intTOString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        String str=Integer.toString(num);

        System.out.println(str);
        // Know sometimes it ask about integer length without using loop
        System.out.println("LENGth" + " "+ str.length());
    }
}
