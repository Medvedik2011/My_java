package Homework_14;

public class Task_5 {
    public static void main(String[] args) {
        /*Зная из урока что при применении к массиву строк метода length, можно узнать сколько
   элементов находится в массиве. Попробовать вывести на экран какое количество раз
   символ 'a' встречается в данной строке:
   Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.
   Решить данную задачу с использованием метода split,
   а также с учетом верхнего и нижнего регистра символа 'a'. */
        String string = "Completely random text in English. In it, we just need to determine how many times" +
                " the character 'a' occurs there. And we can use the split method and the length method.";
        String smallLett = string.toLowerCase();
        String[] smallLett_1 = smallLett.split("a");
        int letter_a = smallLett_1.length;
        System.out.println("Количество букв 'a': " + letter_a);// Я не понимаю, почему их 9
        }

    }

