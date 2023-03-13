package HOMEWORK_16;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /*При помощи цикла while выполнить реализацию следующего алгоритма.
Пользователь вводит строку с клавиатуры. Программа должна вывести на
экран сколько символов "a", присутсвует в данной строке*/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = in.nextLine();

        int i = 0;
        int count = 0;
        while (i < string.length()) {
        if (string.charAt(i) == 'a' || string.charAt(i) == 'A') {
         count++;
          }
         i++;
        }
        System.out.println("Количество символов 'a' в строке: " + count);
    }
}
