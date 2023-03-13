package HOMEWORK_16;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = "";
        String word;
        while (true) {
            System.out.print("Введите слово: ");
            word = in.nextLine();
            if (word.equals("stop")) {
                break;
            } else {
                sentence = sentence + " "  + word;
            }
        }
        System.out.printf("Предложение:" + sentence);
    }
}

