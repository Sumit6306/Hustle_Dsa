package DSA.ARRAY2;
import java.util.Scanner;


class Solution {
    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    return ans;
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENT");
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println("ENTER THE TARGET ELEMENT");
        int target = sc.nextInt();


        int[] sum = twoSum(nums, target);
        System.out.println(sum);


    }
}