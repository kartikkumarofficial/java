package dsa.maths;

import java.util.Arrays;

public class sieveoferathastotheness {

    public static void main(String[] args) {
        int num = 20;
        prime(num);
    }

    private static void prime(int n) {

        boolean[] isPrime = new boolean[n + 1];

        // Mark all numbers as prime initially
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // Sieve logic
        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                int j = i * i;

                while (j <= n) {
                    isPrime[j] = false;
                    j += i;
                }
            }
        }

        // Print primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}