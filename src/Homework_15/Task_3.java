package Homework_15;

import java.util.Date;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        /*Пользователь вводит с клавиатуры свой год рождения. На консол выводится информация
        о его возрасте.
(P.s пока не затрагиваем момент месяца рождения, останавливаемся только на разнице годов. Если вам
вдруг понадобится преобразовать тип String в int, то можете воспользоватьсятакой конструкцией
Integer.parseInt(строка для преобразования).*/
    Scanner input = new Scanner(System.in);
        System.out.println("Введите год своего рождения:");
        int Birthday = input.nextInt();
        System.out.println("Введите расчетный год:");
        int Year = input.nextInt();
        int Result = Year - Birthday;
        System.out.printf("Ваш возраст %d лет.", Result);

}
}
