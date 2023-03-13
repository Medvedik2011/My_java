package HOMEWORK_16;

import java.util.Scanner;
/*3)(Использовать операторы if-else-if)
Пользоватьель вводит с клавиатуры числа:
Если число равно 1, то выводин на консоль "Понедельник";
Если число равно 2, то выводин на консоль "Вторник";
Если число равно 3, то выводин на консоль "Среда";
Если число равно 4, то выводин на консоль "Четверг";
Если число равно 5, то выводин на консоль "Пятница";
Если число равно 6, то выводин на консоль "Суббота";
Если число равно 7, то выводин на консоль "Воскресенье";
В противном случае выводим текст:
"Лучше бы сегодня была пятница".*/
public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7:");
        int x = input.nextInt();
        if (x < 1 || x > 7) {
            System.out.println("Лучше бы сегодня была пятница");
        } else if (x == 1) {
            System.out.println("Monday");
        } else if (x == 2) {
            System.out.println("Tuesday");
        } else if (x == 3) {
            System.out.println("Wednesday");
        } else if (x == 4) {
            System.out.println("Thursday");
        } else if (x == 5) {
            System.out.println("Friday");
        } else if (x == 6) {
            System.out.println("Saturday");
        } else  {
            System.out.println("Sunday");
        }

    }
}

