package Leetcode;

public class EvenNumberDigit {
    public static void main(String[] args) {
        int[] nums = {435, 432, 543, 3, 542};
        int elm = 0;

        for (int num : nums) {
            if (even(num)) {
                elm++;
            }
        }

        System.out.println(elm);
    }

    static boolean even(int num) {
        int digit = digit(num);

        if (digit % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digit(int num) {
        int count = 0;

        if(num < 0){
            num = num*-1;
        }

        if (num==0){
            return 1;
        }
        
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
