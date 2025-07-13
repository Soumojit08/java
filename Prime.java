import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        if(ans){
        System.out.println("The number " + n + " is prime");
        } else {
            System.out.println("The number " + n + " is not prime");
        }
        in.close();
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if (n % 2 == 0){
                return false;
            }
            c++;
        }

        return true;
    }


}
