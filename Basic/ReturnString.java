package Basic;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        String msg = greet();

        System.out.println(msg);
    }

    static String greet() {
        Scanner in = new Scanner(System.in);
        System.out.println("How are you !!");
        String str = in.nextLine();
        in.close();

        return str;
    }
}
