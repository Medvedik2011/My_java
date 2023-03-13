package HOMEWORK_16;

import java.util.Scanner;

public class Task_5 {
    /*Написать программу в которой пользователь вводит с клавиатуры число,
а программа определяет, является она полиндромом или нет.
И выводит данную информацию на экран.*/
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        int finalNumber = 0;
        int testNumber = number;
        while (testNumber != 0) {
            int ostatok = testNumber % 10;
            finalNumber = finalNumber * 10 + ostatok;
            testNumber /= 10;
             }
        if (number == finalNumber) {
            System.out.println(number + " Это палиндром");
        } else {
            System.out.println(number + " Это не палиндром");
        }
    }
}


  //  }
