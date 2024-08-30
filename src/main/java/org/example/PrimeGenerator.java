package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;  // Number of primes found
        int num = 2;    // The number to be checked

        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }

        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;  // 2 is the only even prime number
        if (num % 2 == 0) return false; // Even numbers greater than 2 are not prime

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Number of primes to generate
        List<Integer> primes = generatePrimes(n);
        System.out.println("First " + n + " prime numbers: " + primes);
    }
}

