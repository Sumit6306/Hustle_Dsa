package DSA.ARRAY;

import java.util.Scanner;

public class firstrepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int m = arr.length;
        int ans = 0;


        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr[i] == arr[j]) {
                    ans++;

                }
            }
        }


        System.out.println(ans);
    }
        }



