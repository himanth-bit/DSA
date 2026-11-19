import java.util.Scanner;

public class PalindromeLessThanN {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Palindrome numbers less than " + n + ":");
        for (int i = 0; i < n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}