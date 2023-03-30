package Java_Second_Chance;

import java.io.PrintStream;
import java.util.Scanner;
/*
public class Methods_and_parameters_of_methods //{
        /*public static void main(String[] args) {
                method1();// это вызов методов
                method2();
                method3();
        }*/
        /*static void method1(){          //это сами методы и его тело
                System.out.println("Hello everybody");
        }
        static void method2(){
                System.out.println("Я дупля не отбиваю");
        }
        static void method3(){
                System.out.println("Kill me please");
        }


        public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("Input num");
                int num=in.nextInt();
               switch (num){
                        case (10): method1();
break;
                        case(20): method2();
                        break;
               }
                if(num!=10&&num!=20){ method3();}*/


        /*public static void main(String[] args) {
                int a = 6;
                int b = 8;
                sum(a, b);  // 14
                sum(3, a);  // 9
                sum(5, 23); // 28

        }//Тело метода должно быть всегда за классом main
        static void sum(int a,int b){

                int z = a + b;
                System.out.println(z);
        }

        }*/
         /*              public static void main(String args[]) {

                        display("Tom", 34);
                        display("Bob", 28);
                        display("Sam", 23);
                }

                static void display(String name, int age) {

                        System.out.println(name);
                        System.out.println(age);
                }
        }*/
        //Параметры переменной длины
        /*public static void main(String args[]) {

                sum(1, 2, 3);           // 6
                sum(1, 2, 3, 4, 5);     // 15
                sum();                  // 0
        }

        static void sum(int... nums) {

                int result = 0;
                for (int n: nums)
                        result +=n;
                System.out.println(result);
        }
}*/
        /*public static void main(String[] args) {

                sum("Welcome!", 20, 10);
                sum("Hello World!");
        }

        static void sum(String message, int... nums) {

                System.out.println(message);
                int result = 0;
                for (int x : nums)
                        result += x;
                System.out.println(result);
        }*/
        /*public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("input a");
                int a=in.nextInt();
                System.out.println("input b");
                int b= in.nextInt();
                System.out.println("input c");
                int c=in.nextInt();
                int x=sum(a,b,c);
                int y=sum(a,b,4568);
                System.out.println("Сумма чисел х="+x);
                System.out.println("Сумма чисел y="+y);

        }
        static int sum(int a,int b, int c){
                return a+b+c;

        }*/

        /*public static void main (String args[]){

                System.out.println(daytime(25));     // Good morning
                System.out.println(daytime(15));    // Good after noon
                System.out.println(daytime(6));    // Good evening
                System.out.println(daytime(17));     // Good night*/

        /*static String daytime(int hour){

                if (hour >24 || hour < 0)
                        return "Invalid data";
                else if(hour > 21 || hour < 6)
                        return "Good night";
                else if(hour >= 15)
                        return "Good evening";
                else if(hour >= 11)
                        return "Good after noon";
                else
                        return "Good morning";
        }*/

        /*public static void main (String args[]){

                daytime(7);     // Good morning
                daytime(13);    // Good after noon
                daytime(32);    //
                daytime(56);    //
                daytime(2);     // Good night
        }
        static void daytime(int hour){

                if (hour >24 || hour < 0)
                        return; *//*Если переданное в метод datetime значение больше 24 или меньше 0,
                         то просто выходим из метода. Возвращаемое значение после return
                         указывать в этом случае не нужно.*//*
                if(hour > 21 || hour < 6)
                        System.out.println("Good night");
                else if(hour >= 15)
                        System.out.println("Good evening");
                else if(hour >= 11)
                        System.out.println("Good after noon");
                else
                        System.out.println("Good morning");}
}*/




