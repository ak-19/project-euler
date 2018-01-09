package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num005SmallestMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(findSmallestMultiple(n));
        }
    }

    public static long findSmallestMultiple(int n) {
        if (n == 1) {
            return 1;
        }

        long lcm = 2;

        for (int i = 3; i <= n; i++) {
            lcm = LCM(lcm, i);
        }

        return lcm;
    }

    private static long LCM(long first, long second) {
        return first * second / GCD(Math.max(first, second), Math.min(first, second));
    }

    private static long GCD(long first, long second) {
        if (second == 0){
            return first;
        }
        return GCD(second, first % second);
    }
}
