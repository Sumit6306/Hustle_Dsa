package DSA.RECURSION;

import java.util.Scanner;

public class vailadParenthese {
    static void generateParenthesis(int open , int close,int n,String s ) {
        if(s.length()==2*n){
            System.out.println(s);
            return ;
        }
       if(open<n) generateParenthesis(open+1,close,n,s+"(" );
       if(open> close) generateParenthesis(open ,close+1,n,s+")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of parenthesis");
        int n = sc.nextInt();
        generateParenthesis(0 ,0 ,n,"");


    }
}
