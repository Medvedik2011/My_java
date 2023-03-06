package Homework_14;

public class Task_2 { /*Создать две переменные типа double:
   chislitel = 7.0;
   znamenatel =5.0;
   Используя явный кастинг вывести на экран результат приведения 7.0/5.0 к виду правильной дроби.
   Тобишь вывести текст следующего типа:
   Целая часть равна - (значение целой части без вещественной).
   Остаток от деления равен - (значение остатка от делеения, в виде целого числа, без вещественной части).
   Знаменатель равен - (значения знаменателя в виде целой части, без вещечтвенной части).*/
    public static void main(String[] args) {
        double chislitel = 7.0;
        double znamenatel = 5.0;
        int x = (int) (chislitel / znamenatel);
        int y = (int) (chislitel % znamenatel);
        int z = (int) znamenatel;

        System.out.println("Целая часть равна " + x);
        System.out.println("Остаток от деления равен " + y);
        System.out.println("Знаменатель равен " + z);

    }
}
