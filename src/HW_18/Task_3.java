package HW_18;
/*Используя рекурсию напишите метод, который будет выводить введенное число в обратном порядке, так чтобы каждая
      цифра писалась два раза, после ставился пробел, и вторая цифра тоже писалась два раза и после ставился пробел...
      Пример: вы вводите 563
      вывод будет следующий 33 66 55*/
public class Task_3 {
    public static void main(String[] args) {
        int num = 563;
        dblNum(num);
    }
    public static void dblNum(int num) {
        if (num == 0) {
            return;
        }

        int x=num % 10;
        System.out.print(x+ "" + x + " ");
        dblNum(num / 10);
    }
}
