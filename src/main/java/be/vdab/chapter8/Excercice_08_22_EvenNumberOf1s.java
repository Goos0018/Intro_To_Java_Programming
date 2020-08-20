package be.vdab.chapter8;

import java.util.Random;

public class Excercice_08_22_EvenNumberOf1s {
    public static void main(String[] args) {
        displayMatrix(generateMatrix());
    }

    private static int[][] generateMatrix() {
        int[][] matrix = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + "  ");
            }
        }
        checkMatrix(matrix);
    }

    private static void checkMatrix(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

            }

        }
    }
}

