package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num002EvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            System.out.println(sumOfEvenFibonacciNumbers(n));
        }
    }

    private static long sumOfEvenFibonacciNumbers(long N) {
        if (N <= 1) {
            return 1;
        }

        long cache = 1;
        long pFib = 1;
        long fib = 2;
        long sum = 2;

        for (int i = 3; fib <= N; i++) {
            cache = fib;
            fib = fib  + pFib;
            if (fib % 2 == 0 && fib <= N){
                sum += fib;
            }
            pFib = cache;
        }

        return sum;
    }
}
