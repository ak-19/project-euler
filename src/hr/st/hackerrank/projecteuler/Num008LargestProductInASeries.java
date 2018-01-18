package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num008LargestProductInASeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            System.out.println(largestProductFaster(n, k, num));
        }
    }

    //O(KN), by task specs worst case is 7 x 1000 = 7000 which is not problem, this is passing on hackerRank
    public static int largestProductSlow(int n, int k, String integer) {
        int max = 0;
        for (int start = 0; start <= n - k; start++) {
            int p = 1;
            for (int step = 0; step < k; step++) {
                p *= integer.charAt(start + step) - 48;
                if (p == 0) {
                    break;
                }
            }
            max = Math.max(max, p);
        }
        return max;
    }
    //on bigger set of numbers it can be optimized to almost O(N), algorithm is similar to Boyer-Moore with twist on zero hit
    public static int largestProductFaster(int n, int k, String integer) {
        int max = 0;
        int step = 1;
        int p = 1;
        int i = 0;

        while (i < n) {
            int digit = integer.charAt(i) - 48;
            if (digit == 0) {
                step = 1;
                p = 1;
            } else {
                if (step == k) {
                    p *= digit;
                    max = Math.max(max, p);
                } else if (step > k) {
                    int firstDigit = integer.charAt(i - k) - 48;
                    p /= firstDigit;
                    p *= digit;
                    max = Math.max(max, p);
                }else{
                    p *= digit;
                }
                step++;
            }

            i++;
        }

        return max;
    }
}
