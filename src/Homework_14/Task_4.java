package Homework_14;

public class Task_4 {
    public static void main(String[] args) {
        /*Создать строку string = "Testing, is my favourite job"
   Вывести на экран отдельно каждое слово и длину этого слова в след виде:
   Cлово1 = (значение слова), Длина этого слова = (значение длины слова).
   Cлово2 = (значение слова), Длина этого слова = (значение длины слова).
   и т.д.
   Вывести на консоль true, если первое слово длиннее остальных, в
   противном случае вывести false.*/

        String string = "Testing, is my favourite job";
        String one = string.split(" ") [0];
        String two = string.split(" ") [1];
        String three = string.split(" ") [2];
        String four = string.split(" ") [3];
        String five = string.split(" ") [4];

        int lengthOfone = one.length();
        int lengthOftwo = two.length();
        int lengthOfthree = three.length();
        int lengthOffour = four.length();
        int lengthOffive = five.length();
        boolean final1 = lengthOfone > (lengthOftwo);
        boolean final2 = lengthOfone > (lengthOfthree);
        boolean final3 = lengthOfone > (lengthOffour);
        boolean final4 = lengthOfone > (lengthOffive);
        System.out.println("Cлово1 = " + one + ", " + "Длина этого слова = " + lengthOfone + ".");
        System.out.println("Cлово2 = " + two + ", " + "Длина этого слова = " + lengthOftwo + ".");
        System.out.println("Cлово3 = " + three + ", " + "Длина этого слова = " + lengthOfthree + ".");
        System.out.println("Cлово4 = " + four + ", " + "Длина этого слова = " + lengthOffour + ".");
        System.out.println("Cлово5 = " + five + ", " + "Длина этого слова = " + lengthOffive + ".");
        System.out.println(final1);
        System.out.println(final2);
        System.out.println(final3);
        System.out.println(final4);


    }
}
