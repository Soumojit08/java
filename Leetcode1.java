import java.util.Arrays;
import java.util.Scanner;

public class Leetcode1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = inp.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = inp.nextInt();
        }
        getConcatenation(nums);
    }

    static void getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];

        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }

        System.out.println(Arrays.toString(ans));
    }

}
