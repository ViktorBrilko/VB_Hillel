package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VB_Homework_4 {
    public static void main(String[] args) {
        int[][] array = initMatrix();
        showMatrix(array);
        changeDiagonals(array);
        showMatrix(array);
    }

    public static int[][] initMatrix() {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожалуйста введите размер матрицы: ");
        int size = scan.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = r.nextInt(100);
            }
        }
        return array;
    }

    public static void showMatrix(int[][] array) {
        System.out.println("Ваша матрица - " + Arrays.deepToString(array));
    }

    public static void changeDiagonals(int[][] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i][i];
            if (i == 0) {
                int temp1 = array[array.length - 1][i];

                array[i][i] = array[i][array.length - 1];
                array[i][array.length - 1] = temp;

                array[array.length - 1][i] = array[array.length - 1][array.length - 1];
                array[array.length - 1][array.length - 1] = temp1;
            } else {
                int temp1 = array[array.length - i - 1][i];
                array[i][i] = array[i][array.length - i - 1];
                array[i][array.length - i - 1] = temp;

                array[array.length - i - 1][i] = array[array.length - i - 1][array.length - i -1];
                array[array.length - i - 1][array.length - i -1] = temp1;
            }
        }
    }

}
