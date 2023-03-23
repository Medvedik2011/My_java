package HW_18;
/*Написать метод, принимающий в качестве параметров два числа,
   который будет выводить на консоль сумму этих двух чисел.
   Написать второй метод, который будет возвращать сумму двух чисел,
   которые он будет принимать в параметре метода.
Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.*/
public class Task_1 {
    public static void printSum(int a, int b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public static int sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        printSum(x, y);
        int result = sum(x, y);
        System.out.println("Результат вычисления суммы: " + result);
    }
}