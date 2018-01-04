package hr.st.hackerrank.projecteuler;

import java.util.Scanner;

public class Num004LargestPalindromeProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(findLargestPalindromeProduct(n));
        }
    }

    public static int findLargestPalindromeProduct(int n) {
        int max = 101101;
        for (int first = 100; first <= 999; first++) {
            for (int second = 100; second <= 999; second++) {
                int product = first * second;
                if (product >= n - 1) {
                    break;
                }
                if (isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    private static boolean isPalindrome(int num) {
        String stringfied = String.valueOf(num);
        int start = 0, end = stringfied.length() - 1;
        while (start < end) {
            if (stringfied.charAt(start++) != stringfied.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
