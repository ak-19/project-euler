package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num001MultiplesOf3And5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(getSumOfMultiplies(n));
        }
    }

    public static long getSumOfMultiplies(int n) {
        long q3n = (n - 1) / 3;
        long q5n = (n - 1) / 5;
        long q15n = (n - 1) / 15;
        long sum = (q3n * 3 * (q3n + 1)) / 2 + (q5n * 5 * (q5n + 1)) / 2 - (q15n * 15 * (q15n + 1)) / 2;
        return sum;
    }
}
