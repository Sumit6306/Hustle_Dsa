package DSA.RECURSION;

public class CountOfDigit {
    public static void main(String[] args) {
        System.out.println(count(123456));
    }
    static  int count(int n){

            if (n==0) return 0 ;
            int count=0;
            return count(n/10) + count +1;


    }
}
