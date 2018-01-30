package hr.st.hackerrank.projecteuler;

import java.util.HashMap;
import java.util.Scanner;

public class Num009SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        HashMap<Integer, Integer> triplets = preCalculateTripletSumsUpTo3000();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            Integer existingProduct = triplets.get(n);
            if (existingProduct == null) {
                System.out.println(-1);
            } else {
                System.out.println(existingProduct);
            }
        }
    }

    public static HashMap<Integer, Integer> preCalculateTripletSumsUpTo3000() {
        HashMap<Integer, Integer> tripletSum = new HashMap<Integer, Integer>();
        for (int a = 3; a <= 2998; a++) {
            for (int b = a + 1; b <= 2999; b++) {
                int leftSide = a * a + b * b;
                //solve little equation to save 1 loop and speed everything up ! from O(N^3) to O(N^2)
                int c = (int)Math.sqrt(leftSide);
                int rightSide = c * c;
                if (leftSide == rightSide) {
                    int sum = a + b + c;
                    int currentProduct = a * b * c;
                    Integer product = tripletSum.get(sum);
                    if (product == null || product < currentProduct) {
                        tripletSum.put(sum, currentProduct);
                    }
                }
            }
        }
        return tripletSum;
    }
}
