package homeWork;

import java.util.Date;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
//        Задание 1
        Scanner words = new Scanner(System.in);
        String arrayWords = "";
        String stopWord ;
        stopWord = "";
        while (true) {
            System.out.println("Введите слово");
            stopWord = words.nextLine();
            if (stopWord.equals("STOP"))
                break;
            arrayWords = arrayWords + " " + stopWord;
            System.out.println(arrayWords);
        }
        System.out.println(arrayWords);

//        Задание 2
        Scanner polindromNumber = new Scanner(System.in);
        System.out.println("enter number");
        String number = polindromNumber.nextLine();
        boolean polindrom=true;
        char[] number1 = number.toCharArray();
        for (int i = 0; i<=number1.length/2 -1; i++) {
            if (number1[i] != number1[number1.length - i-1])
           polindrom=false;
        }
        if (polindrom)
        System.out.println("polindrom");
        else
            System.out.println("ne polindrom");


//        Task 3
        Scanner in = new Scanner(System.in);
        System.out.println("Введите максимальный вес склада");
        int maxWeight = in.nextInt();
        int countOfWeight = 0;
        while (countOfWeight <= maxWeight) {
            if(countOfWeight == maxWeight){
                break;
            }
            System.out.println("Какое кол-во металла хотите сдать?");
            int metalCount = in.nextInt();
            if (metalCount < 5){
                System.out.println("Слишком маленький вес для приема на склад");
                System.out.println("Осталось места на " + (maxWeight - countOfWeight));
                continue;
            }
            if (countOfWeight + metalCount > maxWeight){
                System.out.println("Размер склада превышен");
                System.out.println("Осталось места на " + (maxWeight - countOfWeight));
                continue;
            }
            countOfWeight = countOfWeight + metalCount;
            System.out.println("Осталось места на " + (maxWeight - countOfWeight));
        }

//        Task 4
        Scanner newScanner = new Scanner(System.in);
        Date date = new Date();
        String[] arrayNames={"Петя","Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] arrayDate={10, 12, 14, 16, 18, 20};
        String[] arrayPlaces={ "школу", "магазин", "церковь", "тренажерный", "зал", "кино", "поликлинику"};
        System.out.println("enter first number");
        int firstNumber = newScanner.nextInt();
        System.out.println("enter second number");
        int secondNumber = newScanner.nextInt();
        System.out.println("enter third number");
        int thirdNumber = newScanner.nextInt();
        System.out.printf("%1$s будет идти в %3$s в %2$s:00", arrayNames[firstNumber], arrayDate[secondNumber], arrayPlaces[thirdNumber]);

//        Task 5
        Scanner userNumbers = new Scanner(System.in);
        int[] numberArray = {1,22,30,41,52,66,7,85,92,10};
        System.out.println("enter any number");
        int userNumber = userNumbers.nextInt();
        boolean numberEquel=false;
        for (int i=0; i<10 ; i++) {
            if (userNumber == numberArray[i])
                numberEquel=true;
        }
        if (numberEquel)
            System.out.println("такого числа есть в массиве");
        else
            System.out.println("такое число нету в массиве");



//        Task 6
        int[] newNumberArray = {-5, 34, 22, -43, -49, 13, 27, 45, -8, 16,
                6, -22, 35, -41, 20, -31, -12, -28, 41, 39, 15, -25,
                -30, 19, 29, 2, -34, -17, -3, 44, 11, -18, -14, 47, 38,
                -33, -15, 37, -23, -36, 7, -47, -20, -2, -40};
        int minNumber= newNumberArray[0];
        int maxNumber = newNumberArray[0];
            for (int i=1; i<45; i++){
                if (minNumber>newNumberArray[i])
                    minNumber=newNumberArray[i];
                if (maxNumber<newNumberArray[i])
                    maxNumber=newNumberArray[i];
            }
        System.out.println(minNumber);
        System.out.println(maxNumber);






    }
}
