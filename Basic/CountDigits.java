package Basic;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        int digit = 0;
        while (n>0){
            n = n/10;
            digit++;
        }

        System.out.println("Digits of the number is : " + digit);
    }
}
