package DSA.RECURSION;

public class nfactorial {
static int fac(int n){
   if(n==0) {
      return 1;
   }
   int samllerfac=fac(n-1);
   return n * samllerfac;

}

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
