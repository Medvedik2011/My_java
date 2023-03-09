package Homework_15;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*Пользователь вводит с клавиатуры три целочисленных значения
На экран выводится информация можно ли из этих сторон
построить треугольник.*/
        Scanner input = new Scanner(System.in);

                System.out.println("Введите три целочисленных значения для сторон треугольника:");
        System.out.println("Сторона А");
        int A = input.nextInt();
        System.out.println("Сторона B");
        int B = input.nextInt();
        System.out.println("Сторона C");
        int C = input.nextInt();
        boolean triangle = (A + B > C) && (A + C > B) && (B + C > A);
        System.out.printf("Можно ли построить треугольник со сторонами %d, %d, %d? %b", (A), (B), (C), triangle);
    }
}
