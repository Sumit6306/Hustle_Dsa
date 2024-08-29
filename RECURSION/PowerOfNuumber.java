package DSA.RECURSION;

public class PowerOfNuumber {
    static int power(int p,int q){
        if(q==0) return 1;
        return power(p,q-1)*p;

    }
    static int  pow(int p,int q){
        if (q==0) return 1;
        if (q%2==0){
          return pow(p,q/2)*pow(p,q/2);

        }else{

           return pow(p,q/2)*pow(p,q/2)*p;
        }

    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(pow(2,3));
    }
}
