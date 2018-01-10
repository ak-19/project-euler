package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num006SumSquareDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(findSumSquareDifference(n));
        }
    }

    public static long findSumSquareDifference(long n) {
        long sum = n * (n + 1) / 2;
        long squaresSum = n * (n + 1) * (2 * n + 1) / 6;
        return sum * sum - squaresSum;
    }
}
