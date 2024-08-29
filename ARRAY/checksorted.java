package DSA.ARRAY;

import java.util.Scanner;

public class checksorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new  int [n];

        boolean check= true;
        System.out.println("Enter the element of array:");
for (int i = 0; i<arr.length;i++){
    arr[i]= sc.nextInt();
}
for (int i =1 ;i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                check=false;
            }
        }
        System.out.println(check);

    }

}
