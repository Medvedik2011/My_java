package Homework_17;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
/*Заполнить массив на 45 элементов случайными числами
от -50 до +50. Найти минимальный элемент и вывести его
на консоль. Найти максимальный элемент и вывести его на
консоль.*/
        int[] matrix = new int[45];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = ((int)(Math.random() * 101)-50);
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
        }
        int min = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] < min) {
                min = matrix[i];
            }
        }
        System.out.printf("MIN значение в массиве: %s", min);

        int max = matrix[0];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] > max) {
                max = matrix[i];
            }
        }
        System.out.printf("\nMAX значение в массиве: %s", max);





    }
}
