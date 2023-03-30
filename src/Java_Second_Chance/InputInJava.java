package Java_Second_Chance;

public class InputInJava {
    /*public static void main(String[] args) {
        
      System.out.print("Hello everybody\n");
        int x=1;
        int y=2;
        int z=x+y;
        System.out.println("z="+z);
        int x=10, y=20;
        int z=y-x;
        System.out.println("z= "+z);
        x=15;
        System.out.println();
        System.out.println("x="+x);
        x=x+1;
        System.out.println();
        System.out.println("x="+x);*/
        /*Ключевое слово var 
        var x=3456;
        var s=0.165489;
        var f=-1245876635;
        System.out.println(x);
        System.out.println(s);
        System.out.println(f);*/

        /*//Констаты (можно присвоить значение 1 раз)
        final var END=25;
        final double PI=3.14;
        System.out.println(END+"\n"+PI);*/

        /*//Типы данных
        byte a=1, b=2;
        short c=3, d=4;
        int e=5, f=6;
        long g=-15_518, h=-545_664_351;
        double pi=3.14;
        float pi2=3.146456f;
        boolean bul=pi2>pi ;
        boolean bul2=g>d;
        System.out.println("a="+a+"b="+b+"c="+c+"d="+d+"e="+e+"f="+f+"g="+g+"f="+f);
        System.out.println();
        System.out.println("pi="+pi+"pi2="+pi2+"\n"+bul+" "+bul2);*/

        /*//Целые числа и дробные числа. Символы и строки. Синтаксис.
        int x=10;
        long l=102_325_526l;
        float fl=3.14f;
        double db=3.14;
        char ch=102;
        char ch1='f';
        System.out.println(x);
        System.out.println(l);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(ch);
        System.out.println(ch1);
        String hi="Hello loshary";
        System.out.printf(hi);
        System.out.printf("\nЯ печатаю с новой строки\n"+hi);
        System.out.printf("""
               \nПривет всем
               это очень крутая штука
               очень жаль что очень туго доходит""");
        System.out.println("\nТекст первой строки\n"+
                "Текст второй строки");
        String text= """
                Я очень хочу раздуплить Джаву, 
                Но она дается нелегко, 
                Пока это только цветочки""";
        System.out.println(text);
    }*/

    /*public static void main(String[] args) {
        Вывод на консоль в классе System есть объект out
         в котором опрределен метод println для вывода информации на консоль*/
       /* System.out.println("Я пошел ужинать.");
        System.out.println("Я вернулся домой. Ужин был вкусный");
        System.out.print("Я пошел ужинать");
        System.out.print("Я вернулся домой. \n Ужин был вкусный");*/
        /*int a=45,b=24;
        System.out.println("a="+a+" b="+b);
        System.out.printf("a=%d, b=%d",a,b);*/

       /* //Спецификаторы
        String name="Vasyl";
        String lastName="Shmatkov";
        int age=11;
        double weight=4.5;
        String dateOfBirth="30/06/2012";
        System.out.printf("Имя %s \nФамилия %s \nage %d \nweight %.2f \nДень рождения %s\n", name,lastName, age, weight, dateOfBirth);*/

        //Ввод с консоли
       /* public static void main(String[] args) {
            /*Scanner in=new Scanner(System.in);
            System.out.println("Введите число");
            int num=in.nextInt();
            System.out.println("Ваше число:" + num);*/

           /* Scanner in = new Scanner(System.in);
            System.out.println("Input name ");
            String name = in.nextLine();
            System.out.println("Input last name ");
            String lname = in.nextLine();
            System.out.println("Input age ");
            int age = in.nextInt();
            System.out.println("Input height ");
            double height = in.nextDouble();
            System.out.println("Input weight");
            float weigth = in.nextFloat();
            System.out.printf("Name: %s; Last name %s; Age %d; height %.2f; weight %.2f",
                    name, lname, age, height, weigth);*/

        //Арифметические операции
    /*int a=55, b=10, c=45, d=-70;
    int f=a+b-c;
    int w=a*b;
   double e=c/45;
       int t=d%c;
            System.out.printf("a= %d; b=%d; c=%d; d=%d f= %d;\n w= %d; e= %.1f; t=%d"
                    ,a,b,c,d,f,w,e,t);*/

            /*//Унарные операции префиксный инкремент ++а
            int a=10;
            int b=++a;//b=a+1
            System.out.println("a="+a);
            System.out.println("b="+b);
            //Унарные операции постфиксный инкремент а++
            int c=10;
            int d=c++; //d=c; c=c+1
            System.out.println("c="+c);
            System.out.println("d="+d);
            //Унарные операции префиксный декремент --a
            int e=10;
            int f=--e;//e=e-1 and then f=e
            System.out.println("e="+e);
            System.out.println("f="+f);
            //Унарные операции постфиксный декремент а--
            int g=10;
            int h=g--; //h=10 and then g=g-1
            System.out.println("g="+g);
            System.out.println("h="+h);
            //****************************/

            //Логические операции сравнения типа boolean
            /*int a=10, b=15;
            boolean c=a==b;
            System.out.println(c);
            boolean d=a==10;
            System.out.println(d);*/

            /*int a=10, b=15;
            boolean c=a!=b;
            System.out.println(c);
            boolean d=a!=10;
            System.out.println(d);*/

            /*int a=10, b=15;
            boolean c=a<b;
            System.out.println(c);
            boolean d=a<10;
            System.out.println(d);*/

            /*int a=10, b=15;
            boolean c=a>b;
            System.out.println(c);
            boolean d=a>10;
            System.out.println(d);*/

          /*  int a=10, b=15;
            boolean c=a<b;
            System.out.println(c);
            boolean d=a<10;
            System.out.println(d);*/

            /*int a=10, b=15;
            boolean c=a<=b;
            System.out.println(c);
            boolean d=a<=10;
            System.out.println(d);*/

            /*boolean c=(3<1)||(5>4);
            System.out.println(c);
            boolean d=(3==1)&(5==6);
            System.out.println(d);
            boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
            boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
            boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
            boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
            boolean a5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
            boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false*/

            //Операции присваивания и приоритет операций
            /*int a=5;
            int b=10;
            int c=20;
            int d=c&=b;
            System.out.println(d);
            }*/

            // Работа со строками
            //Варианты записи строк
            public static void main(String[] args) {
               /* String str1="Hello everybody";
                String str2=new String(); //пустая строка
                String str3=new String(new char[] {'h','e','l','l','o'});
                String str4=new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'},0,3);
                // -начальный индекс, 4 -кол-во символов
                System.out.println(str1);
                System.out.println(str1.length());
                System.out.println(str2);//пустая строка
                System.out.println(str2.length());
                System.out.println(str3);
                System.out.println(str3.length());
                System.out.println(str4);//с 0 элемента на печать 3 симовла
                System.out.println(str4.length());*/

                /*String str3=new String(new char[] {'h','e','l','l','o'});
                char[] array=str3.toCharArray();
                System.out.println(array);*/

                /*String str="";
                if(str.isEmpty()) System.out.println("Строка пустая1");
                if(str.length()==0) System.out.println("Да я посчитал она пустая");*/

                //Основные методы класса String

                /*String str1="Hello";
                String str2="Javaeats";
                String str3=str1+" "+str2;
                System.out.println(str3);
                String str4="Vasya is "+11+" years old";
                System.out.println(str4);
                System.out.println(str1+str2);

                String str5=str4.concat(str2);//concat()

                System.out.println(str5);*/
                /*String str3=String.join(" ",str1,str2); // join()
                System.out.println(str3);*/

                /*String str3=str1.concat(str2);
                char a=str3.charAt(8); //выводит на экран символ под 8 номером. нумерация с 0
                System.out.println(a);*/

               /* String str="I hate java"; //извлечение группы символов
                int start=2;
                int end=6;
                char[] dst=new char[end-start];
                str.getChars(start, end, dst, 0);
                System.out.println(dst);
                */
                /*String str1="Привет мне очень здесь Нравится";
                String str2="Привет мне очень здесь нравится";
                System.out.println( str1.equals(str2)); //сравнение с учетом регистра
                System.out.println(str1.equalsIgnoreCase(str2)); ////сравнение без учета регистра*/

               /* String text = "FIFA will never regret it";
                String[] words = text.split(" ");
                for(String word : words){
                    System.out.println(word);
                }*/

               /* String text = "FIFA will never regret it";
                String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
                for(String word : words){
                    System.out.println(word);
                }*/

                /*int num1 = 6;
                int num2 = 7;
                if(num1>num2){
                    System.out.println("Первое число больше второго");
                }
                else {
                    System.out.println("Второе число больше либо равно");
                }*/
                /*int num1 = 8;
                int num2 = 8;
                if(num1>num2){
                    System.out.println("Первое число больше второго");
                }
                else if(num1<num2){
                    System.out.println("Первое число меньше второго");
                }
                else{
                    System.out.println("Числа равны");
                }*/
                /*int num = 7;
                switch(num){

                    case 1:
                        System.out.println("число равно 1");
                        break;
                    case 8:
                        System.out.println("число равно 8");
                        num++;
                        break;
                    case 9:
                        System.out.println("число равно 9");
                        break;
                    default:
                        System.out.println("число не равно 1, 8, 9");
                }*/
               /* int x=3;
                int y=4;
                int z = x<y? (x+y) : (x-y);
                System.out.println(z);
                */
                /*Scanner in=new Scanner(System.in);
                System.out.println("Введите число1:");
                int x=in.nextInt();
                System.out.println("Введите число2:");
                int y=in.nextInt();
                if(x<y){
                    System.out.println("x<y");}
                else if(x>y){
                    System.out.println("x>y");}
                else{
                    System.out.println("x=y");
                }*/

                /*Scanner in=new Scanner(System.in);
                System.out.println("Введите число:");
                int x=in.nextInt();
                if(x<9&&x>2){
                    System.out.println("Число больше 5 и меньше 10");}
                else{
                    System.out.println("Ytbpdtcnyjt xbckj");
                }*/
               /* Scanner in=new Scanner(System.in);
                System.out.println("Введите сумму вклада");
                int num=in.nextInt();
                if(num<=100){
                    double num100=num*0.05+num;
                    System.out.println("Сумма вклада"+num100);}
                else if(num>=100&&num<=200){
                    double num200=num*0.07+num;
                    System.out.println("Сумма вклада"+num200);}
                else{ double num300=num*0.1+num;
                    System.out.println("Сумма вклада"+num300);
                }
*/
               /* System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
                Scanner in=new Scanner(System.in);
                int num=in.nextInt();
                 switch (num){
                     case 1:
                         System.out.println("Операция сложения");
                         break;
                     case 2:
                         System.out.println("Операция вычитания");
                         break;
                     case 3:
                         System.out.println("Операция умножения");
                         break;
                     default:
                         System.out.println("Операция не определена");
                 }*/

                /*System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
                Scanner in=new Scanner(System.in);
                int num=in.nextInt();
                System.out.println("Введите два числа");
                int x=in.nextInt();
                int y= in.nextInt();
                if (num==1){
                    int z=x+y;
                        System.out.println("Операция сложения z="+z);}
                else if (num==2){
                    int z=x-y;
                    System.out.println("Операция вычитания z="+z);}

                   else if (num==3){
                    int z=x*y;
                    System.out.println("Операция умножения z="+z);}*/

                /*Scanner in = new Scanner(System.in);

                System.out.print("Введите первое число: ");
                int num1 = in.nextInt();

                System.out.print("Введите второе число: ");
                int num2 = in.nextInt();

                System.out.println("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение");
                int operation = in.nextInt();
                int result = 0;

                switch (operation)
                {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    default:
                        System.out.println("Неизвестная операция");
                }
                if(operation >=1 && operation <= 3){
                    System.out.printf("Результат операции: %d", result);
                }
                in.close();
            }*/
                        // ЦИКЛ for
                /*for(long i=1; i<=10;i++){//задание счетчика, условие, переход счетчика к новой ед
                    System.out.printf("Квадрат числа х %d равно %d\n",i,i*i);
                }*/
               /* int i=1; //вечный цикл все условия пустые, определение вынесено за пределы цикла
                for (;;){
                    System.out.printf("Квадрат числа х %d равно %d\n",i,i*i);
                }*/
                /*int i = 1;
                for (; i<9;){
                    System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
                    i++;
                }*/
                /*int n = 10;
                for(int i=0, j = n - 1; i < j; i++, j--){

                    System.out.println(i * j);
                }*/

               /* int j = -1; //Цикл в любом случае срабатывает 1 раз, несмотря на условие
                do{
                    System.out.println(j);
                    j--;
                }
                while (j > 0);*/

                /*int j=6;
                while (j > 0) {
                    System.out.println(j);
                    j--;
                }*/
                /*for (int i=0; i<10; i++){
                    if (i>=5)
                        break;
                    System.out.println(i);
                }*/
                for (int i=0; i<10; i++){
                    if (i==5)
                        continue;
                    System.out.println(i);
                }

            }

                }










