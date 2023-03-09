package Homework_14;

public class Task_1 { /*Coздать две переменные типа int:
   int a = 7;
   int b = 9;
   Поменять между собой значения переменных a и b.
   Создавать новые переменные нельзя.
   Можно применять только арифметические действия к перемнным a и b.
   Вывести в консоль значения переменных a и b после их переопределения.*/




    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a + b;// a=16
        b = a - b;// b=7
        a = a - b;// a=9
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
