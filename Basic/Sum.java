package Basic;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("The sum is : " + ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 num : ");

        int num1 = in.nextInt();

        System.out.println("Enter 2 num : ");

        int num2 = in.nextInt();

        int sum = num1 + num2;

        in.close();
        return sum;
    }
}
