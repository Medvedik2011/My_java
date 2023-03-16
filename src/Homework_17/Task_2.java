package Homework_17;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
/*Есть одномерный массив из 10 элементов, заполнен-
ный случайными числами. Пользователь вводит с клавиатуры
число. Программа показывает есть ли такое число в созданном
до этого массиве.*/
        int[] matrix = new int[10];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int)(Math.random() * 10);
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int number = input.nextInt();
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            if (number == matrix[i]) {
                found = true;
                System.out.printf("Число %s есть в массиве", number);
                break;

            }
        }




    }
}
