package DSA.RECURSION;

public class SumofDigits {
    static int SOD(int n){
        if (n>=0&&n<=9) return n;
        return SOD(n/10)+SOD(n%10);
    }
    public static void main(String[] args) {
        System.out.println(SOD(1234));

    }
}
