package HOMEWORK_16;

import java.util.Scanner;

public class Task_1 {/*Используя оператор switch написать программу, которая выводит на
консоль ссылку для скачивания программы.
Из выбора программ взять: IntelliJ IDEA, Git, Java.
Из выбора ОС взять: Linux, macOS, Windows.
Программа должна спросить пользователя какая программа ему интересна,
также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
Если программа с таким названием не существует выводит сообщение в консоль, о том
что такой программы не существует.
Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
что такой ОС не существует.*/
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Выберите программу (IntelliJ IDEA, Git, Java):");

        String program = input.nextLine();

        System.out.println("Выберите операционную систему (Linux, macOS, Windows):");
        String os = input.nextLine();
        switch (program.toLowerCase()) {
            case ("intellij idea"):
                switch (os.toLowerCase()){
                    case ("linux"):
                        System.out.println(" https://www.jetbrains.com/ru-ru/idea/download/#section=linux");
                        break;
                    case ("macos"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/#section=mac");
                        break;
                    case ("windows"):
                        System.out.println("https://www.jetbrains.com/ru-ru/idea/download/#section=windows");
                        break;
                        default:
                        System.out.println("Такой ОС не существует");
                }
                break;
            case ("git"):
                switch (os.toLowerCase()){
                    case ("linux"):
                        System.out.println("https://github.com/shiftkey/desktop/releases/download/release-3.1.1-linux1/GitHubDesktop-linux-3.1.1-linux1.deb");
                        break;
                    case ("macos"):
                        System.out.println("https://central.github.com/deployments/desktop/desktop/latest/darwin");
                        break;
                    case ("windows"):
                        System.out.println("https://central.github.com/deployments/desktop/desktop/latest/win32?format=msi");
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                }
                break;
            case ("java"):
                switch (os.toLowerCase()){
                    case ("linux"):
                        System.out.println("https://www.java.com/ru/download/");
                        break;
                    case ("macos"):
                        System.out.println("https://www.java.com/en/download/apple.jsp");
                        break;
                    case ("windows"):
                        System.out.println("https://www.java.com/ru/download/ie_manual.jsp?locale=ru");
                        break;
                    default:
                        System.out.println("Такой ОС не существует");
                }
                break;
            default:
                System.out.println("Такой программы не существует");
        }

                }
                }








