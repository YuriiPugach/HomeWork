package homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {
//        Задача 1
            Scanner newScanner = new Scanner(System.in);
            Random randomNumbers = new Random();
            System.out.println("Введите размерность двухмерного массива");
            int rowCount = Integer.parseInt(newScanner.next());
            int columnCount = Integer.parseInt(newScanner.next());
            int[][] array = new int[rowCount][columnCount];
//            System.out.println(Arrays.deepToString(array));
            int[] maxArray = new int[rowCount];
            for (int i = 0 ; i< rowCount ; i++ )
            {
                int maxNumberFromColumn = 0;
                for (int j = 0; j< columnCount; j++)
                {
                 array[i][j] = randomNumbers.nextInt(0, 1000);
                 if (array[i][j] > maxNumberFromColumn) {
                        maxNumberFromColumn = array[i][j];
                    }

                }
                maxArray[i] = maxNumberFromColumn;
            }
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(maxArray));

//        Задача 2

        String[][] arrayTask2 = {
                {"0","1","2","3","4","5"},
                {"1","-","-","-","-","-"},
                {"2","-","-","-","-","-"},
                {"3","-","-","-","-","-"},
                {"4","-","-","-","-","-"},
                {"5","-","-","-","-","-"}};
        int botRow = randomNumbers.nextInt(1,5);
        int botColum = randomNumbers.nextInt(1,5);
        System.out.println("All Set. Get ready to rumble!");
        arrayShow(arrayTask2);
    while (true)
    {

            System.out.println("введите ряд от 1 до 5");
            int userRow = newScanner.nextInt();
            if (userRow <= 0 || userRow > 5 )
            {
                System.out.println("wrong number");
                continue;
            }
            System.out.println("введите столбец от 1 до 5");
            int userColumn = newScanner.nextInt();
        if (userColumn <= 0 || userColumn > 5 )
        {
            System.out.println("wrong number");
            continue;

        }
            arrayTask2[userRow][userColumn] = "*";
        if (arrayTask2[botRow][botColum] == "*")
        {
            arrayTask2[botRow][botColum] = "x";
            System.out.println("You have won!");
            arrayShow(arrayTask2);

            break;
        }

        arrayShow(arrayTask2);
    }
            }
    static void arrayShow(String[][] array)
    {
        for (String[] string : array)
        {
            System.out.print("(");
            for (String word : string) {
                System.out.print(word + ", ");
            }
            System.out.println("\b\b)");
        }
    }
    }

