package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num010SummationOfPrimes {
    public static void main(String[] args) {
        int MAX = 1000001;
        long[] primes = new long[MAX];
        long[] primesPrefixSum = new long[MAX];

        for (int i = 2; i < MAX; i++) {
            if (primes[i] == 0) {
                for (int p = 2; p > 0 && p * i < MAX; p++) {
                    primes[p * i] = i;
                }
            }
        }

        for (int i = 2; i < MAX; i++) {
            primesPrefixSum[i] = primesPrefixSum[i - 1];
            if (primes[i] == 0) {
                primesPrefixSum[i] += i;
            }
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(primesPrefixSum[n]);
        }
    }
}
