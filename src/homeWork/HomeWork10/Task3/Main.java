package homeWork.HomeWork10.Task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        Father father = new Father("Vasiliy", 1500);
        try {
            father.buyProducts();
        }
        catch (InputMismatchException ex){
            System.out.println("Ошибка ввода: Введены буквы вместо цифер");
        }
    }
}

