import java.util.Scanner;

public class ValidWord {
    public static void main(String[] args) {
        System.out.println("Enter the Word : ");
        Scanner in = new Scanner(System.in);
        String str = in.next();

        boolean ans = Solution(str);
        if (ans){
            System.out.println("The " + str + " is a Valid word");
        } else {
            System.out.println("The " + str + " is not a Valid word");
        }
    }

    static boolean Solution(String word) {
        if (word.length() < 3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;


        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                return false;
            }

            if (Character.isLetter(c)) {
                if (c == 'a' ||
                        c == 'e' ||
                        c == 'i' ||
                        c == 'o' ||
                        c == 'u' ||
                        c == 'A' ||
                        c == 'E' ||
                        c == 'I' ||
                        c == 'O' ||
                        c == 'U'){
                    hasVowel = true;
                }else {
                    hasConsonant = true;
                }
            }

        }

        return hasVowel && hasConsonant;
    }

}
