package Leetcode;

import java.util.Scanner;

public class MaxSubsequence {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int ans = maximumLength(nums);
        System.out.println(ans);
    }

    static int maximumLength(int[] nums){
        int evenCount = 0, oddCount = 0, bothCount = 0;

        int parity = (nums[0]%2);

        for (int num : nums){
            if (num % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }

            if (parity == num % 2){
                bothCount++;
                parity ^= 1;
            }
        }

        return  Math.max(evenCount, Math.max(oddCount, bothCount));
    }
}
