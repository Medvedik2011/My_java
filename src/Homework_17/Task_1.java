package Homework_17;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /*Создать три массива.
Первый будет состоять из следующих имен: "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
Второй будет содержать следующие значения типа int: 10, 12, 14, 16, 18, 20.
Третий будет содержать следующие значения:"школу", "магазин", "церковь", "тренажерный зал", "кино",
"поликлинику".
Пользователь вводит три числа с клавиатуры, которые будут соответствовать
индексам каждого из элементов массивов.
Пример1. после ввода 3,2,1:
На экране должно вывестись следующее сообщение:
"Федя будет идти в магазин в 14:00"
Пример2. после ввода 1,2,3:
На экране должно вывестись следующее сообщение:
"Маша будет идти в тренажерный зал в 14:00"*/
        Scanner input=new Scanner(System.in);
        String[] name={"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] number={10, 12, 14, 16, 18, 20};
        String[] place={"школу", "магазин", "церковь", "тренажерный зал", "кино",
                "поликлинику"};
        System.out.println("Enter name number from 0 to 6");
        int nameNum= input.nextInt();
        System.out.println("Enter number from 0 to 6");
        int numNum= input.nextInt();
        System.out.println("Enter place number from 0 to 6");
        int placeNum= input.nextInt();

        String namefull=name[nameNum];
        int numberfull=number[numNum];
        String placefull=place[placeNum];

        System.out.printf("%s будет идти в %s в %d:00", namefull, placefull, numberfull);



    }
}
