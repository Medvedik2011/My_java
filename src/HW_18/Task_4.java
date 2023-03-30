package HW_18;
/*Написать перегруженный метод, который может:
  - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
    "Я пустой".
  - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
  - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
    через пробел.
  - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
    массива.
  - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/
public class Task_4 {
    public static void print() {
        System.out.println("Я пустой");
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(String[] messages) {
        System.out.println(String.join(" ", messages));
    }

    public static void print(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        System.out.println("Сумма массива: " + sum);
    }

    public static void print(String message, int number) {
        System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + number);
    }

    public static void main(String[] args) {
        print();
        print("Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.");
        print(new String[]{"строка1", "строка2", "строка3"});
        print(new int[]{10,20,30,40});
        print("Печальное настроение насчет всего этого, если честно", 44);
    }
}
