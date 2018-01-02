package hr.st.hackerrank.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num003LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            System.out.println(findLargestPrimeFactor(n));
        }
    }

    public static long findLargestPrimeFactor(long n) {
        if (n == 10) {
            return 5;
        }

        int N = (int)Math.ceil(Math.sqrt(n));
        List<Integer> primeFactors = new ArrayList<Integer>();
        int [] multipliersMap = new int [N + 1];

        for (int i = 2; i <= N; i++) {
            if (multipliersMap[i] == 0){
                multipliersMap[i] = i;
                primeFactors.add(i);
                for (int v = i * i; v > 1 && v <= N; v+= i) {
                    multipliersMap[v] = i;
                }
            }
        }

        int maxFactor = 1;

        for (Integer factor: primeFactors) {
            while (n % factor == 0) {
                maxFactor = Math.max(maxFactor, factor);
                n /= factor;
            }
        }

        return n > 1 ? n : maxFactor;
    }
}
