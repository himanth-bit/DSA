import java.util.Scanner;

public class SumOfDigits {

    public static long sumDigits(long n) {
        n = Math.abs(n); 
        long sum = 0;

        while (n > 0) {
            sum += n % 10; 
            n /= 10;       
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long num = sc.nextLong();

        long result = sumDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + result);

        sc.close();
    }
}