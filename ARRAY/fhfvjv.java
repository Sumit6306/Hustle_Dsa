package DSA.ARRAY;

    import java.util.*;
import java.lang.*;
import java.io.*;

    class Codechef
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner (System.in);
            int T= sc.nextInt();



            while(T>0){
                int N = sc.nextInt();
                int maxheight=0;


                for (int i= 0;i<N ;i++){
                  int height =sc.nextInt();
                    if (height>maxheight){
                        maxheight=height;
                    }
                }
                System.out.print(maxheight);

            }

        }
    }

