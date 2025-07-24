package Basic;

import java.util.Scanner;

public class RevInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            if(rev > Integer.MAX_VALUE/10 ){
                System.out.println("Max limit cross");
            }
            if(rev < Integer.MIN_VALUE/10 ){
                System.out.println("Min limit cross");
            }
            rev = rev * 10 + digit;
        }

        System.out.println("Reversed number : " + rev);

    }
}
