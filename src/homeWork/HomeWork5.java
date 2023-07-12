package homeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
//• За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
//          та пропонує гравцеві через консоль ввести своє ім’я,
//          яке зберігається в змінній name. •
//          Перед початком на екран виводиться текст: Let the game begin! •
//          Сам процес гри обробляється
//        у нескінченному циклі. •
//        Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану кількість з тим, що ввів
//        користувач.
//        • Якщо введене число менше загаданого, програма виводить на екран текст: .
//        Якщо
//        введене число більше за загадане, то програма виводить на екран текст: Your number is too big. Please, try again..
//        • Якщо введене число
//        відповідає загаданому, то програма виводить текст: Congratulations, {name}!
//        • Завдання повинно бути виконане за допомогою масиви
//        (НЕ використовуйте інтерфейси List, Set, Map)
        Random randomNumbers = new Random();
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = newScanner.nextLine();
        System.out.println("Let the game begin!");
        int programRandomNumbers = randomNumbers.nextInt(0, 100);
//        int programRandomNumbers = 5;
        int arrayCount = 0;
        int[] arrayNumbers = new int[100];
        for (int i = 0; i < arrayNumbers.length; i += 0) {
            System.out.println("Введите число от 0 до 100");
            int newUserNumber = newScanner.nextInt();
            if (newUserNumber == programRandomNumbers) {
                System.out.printf("Congratulations, %s", name);
                break;
            }

            if (newUserNumber < programRandomNumbers) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
            boolean numberExist = false;
            for (int k = 0; k <= arrayCount; k++) {
                if (arrayNumbers[k] == newUserNumber) {
                    numberExist = true;
                    break;
                }

            }
            if (numberExist != true) {
                arrayNumbers[arrayCount] = newUserNumber;
                arrayCount++;
            } else {
                System.out.println("Вы уже загадывали это число");
            }

//                for (int j = 0; j < arrayCount; j++) {
//                System.out.print(arrayNumbers[j] + " ");}

        }


    }


}

