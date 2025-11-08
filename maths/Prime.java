package maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));

        int n = 40;
        boolean[] primes = new boolean[n + 1];
        primeNumbers(n, primes);

        System.out.println(primeNumber(13));
        System.out.println(getDivisors(36));
    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return true;
        }

        int c = 2;

        while (c * c <= n) {
            if(n % c == 0) {
                return false;
            }

            c++;
        }

        return true;
    }

    public static void primeNumbers(int n, boolean[] primes) {
        for(int i = 2; i * i <= n; i++) {
            if(!primes[i]) {
                for (int j = i * 2; j <= n; j = j + i){
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <=n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static boolean primeNumber(int n) {
        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        return divisors.size() == 2;
    }

    // optimize technique
    public static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if ((n / i) != i) {
                    divisors.add(n/i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }
}
