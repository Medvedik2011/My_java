package Homework_15;

import java.util.Date;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        /*Написать программу, где пользователю на консоль выводится следующее сообщение:
Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V.
После пользоватею предложат ввести свое имя, номер задания.
А также ввести спицификаторы формата вместо X, Y, Z, W, V.
где X - это имя пользователя,
Y - порядковый номер ДЗ,
Z - время в часах в момент выполнения программы,
W - время в минутах в момент выполнения программы,
V - день недели.
Необходимо написать алгоритм, который вставит необходимые
спецификаторы формата вместо X, Y, Z, W, V. И выведет в консоль
отформатированное сообщение типа:
Уважаемый Сергей, Вы выполняете задание номер 15, и делаете это в 10 часов 20 минут в Среду. */
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = input.nextLine();
        System.out.println("Введите номер задания: ");
        int task = Integer.parseInt(input.nextLine());

        Date date = new Date();
        String answer = String.format("Уважаемый %s, Вы выполняете задание номер %d, и делаете это в %tH часов" +
                " %tM минут в %tA.", name, task, date, date, date);
        System.out.println(answer);
    }
}
