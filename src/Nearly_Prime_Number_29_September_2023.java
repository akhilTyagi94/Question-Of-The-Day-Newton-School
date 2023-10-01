/*

Nearly prime numbers

Time Limit: 2, Memory Limit: 256000

You're given an integer n. Find the total numbers of primes and nearly prime numbers that are less than equal to n.

(Note- A number 'K' is nearly prime if either K+1 or K-1 is prime. )

Input

You are given an integer n ( 2 <= n <= 105).

Output

Print an integer, representing the total number of prime and nearly prime numbers.

 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Nearly_Prime_Number_29_September_2023 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Boolean> isPrime = sieveOfEratosthenes(n);

        int primeCount = countPrimes(isPrime);
        int nearlyPrimeCount = countNearlyPrimes(n, isPrime);

        int totalCount = primeCount + nearlyPrimeCount;

        System.out.println(totalCount);
    }

    public static ArrayList<Boolean> sieveOfEratosthenes(int n) {
        ArrayList<Boolean> isPrime = new ArrayList<>(Arrays.asList(new Boolean[n + 1]));
        Arrays.fill(isPrime.toArray(new Boolean[0]), Boolean.TRUE); // Initialize with TRUE

        isPrime.set(0, false);
        isPrime.set(1, false);

        for (int p = 2; p * p <= n; p++) {
            if (isPrime.get(p)) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime.set(i, false);
                }
            }
        }

        return isPrime;
    }

    public static int countPrimes(ArrayList<Boolean> isPrime) {
        int count = 0;
        for (Boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }
        return count;
    }

    public static int countNearlyPrimes(int n, ArrayList<Boolean> isPrime) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!isPrime.get(i)) {
                if (isNearlyPrime(i, isPrime)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isNearlyPrime(int num, ArrayList<Boolean> isPrime) {
        int primeFactors = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime.get(i)) {
                primeFactors++;
                if (primeFactors > 2) {
                    return false; // More than 2 prime factors, not nearly prime
                }
            }
        }
        return primeFactors == 2; // Exactly 2 prime factors, nearly prime
    }
}
