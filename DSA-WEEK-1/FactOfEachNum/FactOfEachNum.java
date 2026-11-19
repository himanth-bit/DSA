import java.util.Scanner;

public class FactorialOfEachDigit {
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(scanner.nextInt());

        if (num == 0) {
            System.out.println("0! = 1");
            scanner.close();
            return;
        }

        int divisor = 1;
        int temp = num;
        while (temp >= 10) {
            divisor *= 10;
            temp /= 10;
        }

        while (divisor > 0) {
            int digit = num / divisor;
            System.out.println(digit + "! = " + factorial(digit));

            num %= divisor;
            divisor /= 10;
        }

        scanner.close();
    }
}