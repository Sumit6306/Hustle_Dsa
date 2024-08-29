package DSA.RECURSION;

public class fibnacci {
static int fib(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);//consise and effective way


    //we dont need to write as long
//    int previous = fib(n-1);
//    int secondprev= fib(n-2);
//    return previous+secondprev;
}

    public static void main(String[] args) {
    //for n term we can also do this
//        for (int i=1 ; i<=10;i++){
//            System.out.println(fib(i));
//        }
        System.out.println(fib(6));
    }
}