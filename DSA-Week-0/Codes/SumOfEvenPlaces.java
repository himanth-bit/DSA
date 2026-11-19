import java.util.Scanner;

public class SumOfEvenPlaces {

    public static int sumEvenPlaces(long n) {
        String numStr = Long.toString(Math.abs(n));
        int sum = 0;

        for (int i = 1; i < numStr.length(); i += 2) {
            sum += numStr.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long num = sc.nextLong();

        int result = sumEvenPlaces(num);
        System.out.println("Sum of digits at even places of " + num + " is: " + result);

        sc.close();
    }
}