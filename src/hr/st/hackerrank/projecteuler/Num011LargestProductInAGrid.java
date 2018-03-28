package hr.st.hackerrank.projecteuler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Num011LargestProductInAGrid {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for (int grid_i = 0; grid_i < 20; grid_i++) {
            for (int grid_j = 0; grid_j < 20; grid_j++) {
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(findMaxMulOf4(grid));
    }

    private static class Counter {
        long max = 0;
    }

    private static long findMaxMulOf4(int[][] grid) {
        Counter mc = new Counter();
        for (int i = 0; i < 20; i++) {
            checkHorizontal(i, grid, mc);
            checkVertical(i, grid, mc);
        }
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 20; col++) {
                if (row < 17 && col < 17) {
                    checkDiagonal(row, col, grid, mc);
                }
                if (row > 2 && col < 17) {
                    checkInvertedDiagonal(row, col, grid, mc);
                }
            }
        }
        return mc.max;
    }

    private static void checkInvertedDiagonal(int row, int col, int[][] grid, Counter mc) {
        mc.max = Math.max(grid[row][col] * grid[row - 1][col + 1] * grid[row - 2][col + 2] * grid[row - 3][col + 3], mc.max);
    }

    private static void checkDiagonal(int row, int col, int[][] grid, Counter mc) {
        mc.max = Math.max(grid[row][col] * grid[row + 1][col + 1] * grid[row + 2][col + 2] * grid[row + 3][col + 3], mc.max);
    }

    private static void checkVertical(int col, int[][] grid, Counter mc) {
        for (int row = 0; row < 17; row++) {
            mc.max = Math.max(grid[row][col] * grid[row + 1][col] * grid[row + 2][col] * grid[row + 3][col], mc.max);
        }
    }

    private static void checkHorizontal(int row, int[][] grid, Counter mc) {
        for (int col = 0; col < 17; col++) {
            mc.max = Math.max(grid[row][col] * grid[row][col + 1] * grid[row][col + 2] * grid[row][col + 3], mc.max);
        }
    }
}
