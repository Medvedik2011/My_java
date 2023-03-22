package Homework_18;

public class Task_3 {
    public static void main(String[] args) {

    }
    public static void printNum(int n) {
    if (n == 0) {
        return;
    }
    int digit = n % 10;
    System.out.print(digit);
    System.out.print(digit);
    printNum(n / 10);
    System.out.print(" ");
}
}
