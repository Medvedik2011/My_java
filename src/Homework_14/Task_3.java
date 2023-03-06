package Homework_14;

public class Task_3 { /*Создать переменную string1 = "This line that i want to cut, cause it is too long"
   Создать строку string2 в которой должно быть помещено значение строки string1
   Обрезанное до "This line that i want to cut, cause".
   Создать строку string3 на основе string2 которое будет содержать значение
   "This line that don't want to cut, cause it is perfect".
   Вывести на консоль каждое сообщение и его длину.*/
 public static void main(String[] args) {
       String string1 = "This line that i want to cut, cause it is too long";
       String string2 = string1.substring(0,35);
       String string3 = string2.concat(" it is perfect");
     int lengthOfstring1 = string1.length();
     int lengthOfstring2 = string2.length();
     int lengthOfstring3 = string3.length();

     System.out.println(string1 + " - Длина строки " +  lengthOfstring1  + " символов");
     System.out.println(string2 + " - Длина строки " +  lengthOfstring2  + " символов");
     System.out.println(string3 + " - Длина строки " +  lengthOfstring3  + " символов");//
    }
}
