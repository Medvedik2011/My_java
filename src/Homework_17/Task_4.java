package Homework_17;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    /*Имеется массив, размер которого должен быть четным числом и  этот размер вводится пользователем с клавиатуры.
Значения элементов задаются случайным образом в диапазоне от 0 до 100.
Отсортировать первую половину данного массива по возрастанию, а вторую по
убыванию. Вывести на экран изначальный и отсортированный массив.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] matrix;
        while (true) {
            System.out.println("Введите размер массива. Число должно быть четным");
            int size = input.nextInt();
            if (size % 2 != 0) {
                System.out.println("Повторите ввод. Число должно быть четным");
                continue;
            }
            matrix = new int[size];
            break;
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) (Math.random() * 101);
            // Стреляйте - я уже немогу. Сдаюсь.
        }
    }
}