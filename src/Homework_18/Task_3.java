package Homework_18;


import java.util.ArrayList;
import java.util.List;

public class Task_3 {

        public static void main(String[] args) {
            int[] numbers = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            sortNum(numbers);
        }
        public static void sortNum(int[] numbers) {
            List<Integer> chNum = new ArrayList<>();
            List<Integer> nechNum = new ArrayList<>();

            for (int number : numbers) {
                if ((number % 2) == 0) {
                    chNum.add(number);
                } else {
                    nechNum.add(number);
                }
            }

            System.out.println("Четные числа");
            for (int number : chNum) {
                System.out.println(number);
            }

            System.out.println("Нечетные числа");
            for (int number : nechNum) {
                System.out.println(number);
            }
        }

    }
