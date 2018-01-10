package hr.st.hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num00710001Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(findNthPrime(n));
        }
    }
    public static long findNthPrime(int n) {
        int N = n * 15;
        int[] factors = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            if (factors[i] == 0) {
                for (int p = 2; p > 0 && p * i <= N; p ++) {
                    factors[p * i] = i;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (factors[i] == 0) {
                count++;
            }
            if (count == n){
                return i;
            }
        }
        return 0;
    }
}
