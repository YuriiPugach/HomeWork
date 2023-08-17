package homeWork.HomeWork10.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main() throws ChekedBoundary, ChekedNull {

        Random random = new Random();
        double[] arrayNumbers = new double[30];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(0,30);
        }
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("Enter array index");
        Scanner scanner = new Scanner(System.in);
        int userIndex = scanner.nextInt();
        if (userIndex>30 || userIndex<0){
            throw new ChekedBoundary();
        }
        double result = arrayNumbers[userIndex]/arrayNumbers[0];
        if (arrayNumbers[0] == 0) {
            throw  new ChekedNull();
        }
        System.out.println(result);
    }

}
