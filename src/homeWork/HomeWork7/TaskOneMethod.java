package homeWork.HomeWork7;

import java.util.ArrayList;

public class TaskOneMethod {
    public void someMeth(int[] arrayOfNumbers) {
        ArrayList<Integer> arrayListChetnii = new ArrayList<>();
        ArrayList<Integer> arrayListNeChetnii = new ArrayList<>();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                arrayListChetnii.add(arrayOfNumbers[i]);
            } else {
                arrayListNeChetnii.add(arrayOfNumbers[i]);
            }

        }
        System.out.println("массив четных чисел = " + arrayListChetnii + "\nмассив не четных чисел = " + arrayListNeChetnii);

    }
//•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
//            •	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
//            •	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
//            •	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
//            •	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
//        "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
    public static void  taskTwoMethod (){
        System.out.println("Я пустой");
    }
    public static void taskTwoMethod (String string2){
        System.out.println(string2);
    }
    public static void taskTwoMethod (String[] string3){
        for (String targetMap : string3) {
            System.out.print(targetMap + " ");
        }
    }
    public static void taskTwoMethod (int[] int2){
        int summ = 0;
        for (int i = 0; i < int2.length; i++) {
             summ = int2[i] + summ;
            }
        System.out.println("\nСумма элементов массива = " + summ);
    }
    public static void taskTwoMethod (String string5, int int4){
        System.out.println("Ваше сообщение - " + string5 + ", ваше число - " + int4);
    }

}
