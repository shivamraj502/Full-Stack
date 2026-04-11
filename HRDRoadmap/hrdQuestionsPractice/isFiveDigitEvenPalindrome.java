
// isFiveDigitEvenPalindrome
import java.util.Scanner;

public class isFiveDigitEvenPalindrome {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        n = in.nextInt();

        if (n >= 10000 && n <= 99999) {
            if ((10 * (String.valueOf(n).charAt(0)) + String.valueOf(n).charAt(4)) % 2 == 0) {
                if (String.valueOf(n).charAt(0) == String.valueOf(n).charAt(4)) {
                    System.out.println("yes Lucky number.");
                } else {
                    System.out.println("Not Lucky number.");
                }
            } else {
                System.out.println("Not Lucky number.");
            }
        } 
        else {
            System.out.println("Not Lucky number.");
        }
    }
}
