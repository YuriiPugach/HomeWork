package homeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
//        Задание 1
        Scanner myNewString = new Scanner(System.in);
        System.out.println("Ввести строку \"Я тестирую замечательно. Что еще нужно?\"");
        String string1 = myNewString.next();
        String string2 = myNewString.next();
        String string3 = myNewString.next();
        String string4 = myNewString.next() + " " + myNewString.next() + " " + myNewString.next();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println("==========================");

//        Задание 2
        Scanner threeNumbers = new Scanner(System.in);
        System.out.println("Ввести строку \"ввести три целочисленных числа\"");
        int number1 = Integer.parseInt(threeNumbers.next());
        int number2 = Integer.parseInt(threeNumbers.next());
        int number3 = Integer.parseInt(threeNumbers.next());
        if ( (number1 + number2 > number3) &&
                (number3 + number2 > number1) &&
                (number1 + number3 > number2)) {
            System.out.println("получается треугольник");
        }
        else {
            System.out.println("не получается треугольник");

    }
        Scanner twoNumbers = new Scanner(System.in);
        System.out.println("Ввести строку \"ввести два числа\"");
        int number1TwoNumbers = Integer.parseInt(twoNumbers.next());
        int number2TwoNumbers = Integer.parseInt(twoNumbers.next());
        int result = number1TwoNumbers>number2TwoNumbers ? number1TwoNumbers - number2TwoNumbers : number2TwoNumbers - number1TwoNumbers;
        System.out.println(result);

//        Задание 4
        Scanner days = new Scanner(System.in);
        System.out.println("Ввести число от 1 до 7");
        int dayNumber = days.nextInt();
        if (dayNumber == 1) {
            System.out.println("Понедельник");
        } else if (dayNumber == 2) {
            System.out.println("Вторник");
        } else if (dayNumber == 3) {
            System.out.println("Среда");
        } else if (dayNumber == 4) {
            System.out.println("Четверг");
        } else if (dayNumber == 5) {
            System.out.println("Пятница");
        } else if (dayNumber == 6) {
            System.out.println("Суббота");
        } else if (dayNumber == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }
// Задание 5
        Scanner newNumbers = new Scanner(System.in);
        System.out.println("Ввести в строку два" +
                "числа и символ - или + или % или / или * ");
        double newNumber1 = Integer.parseInt(newNumbers.next());
        double newNumber2 = Integer.parseInt(newNumbers.next());
        String newSign3 = (newNumbers.next());
        double newResult = newSign3.equals("-") ? newNumber1 - newNumber2
                : newSign3.equals("+") ? newNumber1 + newNumber2
                : newSign3.equals("%") ? newNumber1 % newNumber2
                : newSign3.equals("*") ? newNumber1 * newNumber2
                : newSign3.equals("/") ? newNumber1 / newNumber2
                : 0;
        System.out.println(newResult);

//        Задание 6
//        IntelliJ IDEA, Git, Java
        Scanner programInput = new Scanner(System.in);
        System.out.println("Какая программа вас интересна?");
        String program = programInput.nextLine().toUpperCase().trim();
//        Linux, macOS, Windows
        System.out.println("Какую ОС вас использует?");
        String os = programInput.nextLine().toUpperCase().trim();

        switch (program) {
            case ("INTELLIJ IDEA"):
                switch (os) {
                    case ("LINUX"):
                        System.out.println("ссылка на скачивание IntelliJ на Linux");
                        break;
                    case ("MACOS"):
                        System.out.println("ссылка на скачивание IntelliJ на MacOS");
                        break;
                    case ("WINDOWS"):
                        System.out.println("ссылка на скачивание IntelliJ на Windows");
                        break;
                    default:
                        System.out.println("такой OS не существует");
                }
                break;
            case ("GIT"):
//                System.out.println("ссылка на скачивание GIT");
                switch (os) {
                    case ("LINUX"):
                        System.out.println("ссылка на скачивание Git на Linux");
                        break;
                    case ("MACOS"):
                        System.out.println("ссылка на скачивание Git на MacOS");
                        break;
                    case ("WINDOWS"):
                        System.out.println("ссылка на скачивание Git на Windows");
                        break;
                    default:
                        System.out.println("такой OS не существует");
                }
                break;
            case ("JAVA"):
//                System.out.println("ссылка на скачивание Java");
                switch (os) {
                    case ("LINUX"):
                        System.out.println("ссылка на скачивание Java на Linux");
                        break;
                    case ("MACOS"):
                        System.out.println("ссылка на скачивание Java на MacOS");
                        break;
                    case ("WINDOWS"):
                        System.out.println("ссылка на скачивание Java на Windows");
                        break;
                    default:
                        System.out.println("такой OS не существует");
                }
                break;
            default:
                System.out.println("такой программы не существует");
        }
        }

    }




