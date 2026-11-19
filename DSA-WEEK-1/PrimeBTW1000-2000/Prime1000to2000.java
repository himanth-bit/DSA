import java.util.Arrays;

public class Prime1000to2000 {
    public static void main(String[] args) {
        int lowerBound = 1000;
        int upperBound = 2000;

        boolean[] isPrime = new boolean[upperBound + 1];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= upperBound; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= upperBound; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n\nTotal primes found: " + count);
    }
}