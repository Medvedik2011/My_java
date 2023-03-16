package Homework_17;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        /*Необходимо вывести на экран перевернутый прямоугольный треугольник
прямым углом сверху в левой части.
Для вывода использовать условные операторы, циклы.
Команду System.out.println(); System.out.print(); и можно использовать только
с одним символом *.
Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
а программа выводит сам треугольник.
Пример с числом 7:
*******
*    *
*   *
*  *
* *
*
Необходимо написать программу для вывода
вначале заполненного, а потом и пустого треугольника. */
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();

            for (int i = 0; i < number; i++) {
            for (int x = 0; x < number - i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*для пустого треугольника
        for (int i = 0; i < number; i++) {
        for (int x = 0; x < number - i; x++){
            понимаю, что тут нужен if но не могу придумать условие.
            {
                System.out.print("*");*/


    }
}

