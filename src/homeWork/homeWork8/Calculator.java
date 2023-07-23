package homeWork.homeWork8;

import java.util.Scanner;

public class Calculator {
    public int summ;
    public int minus;
    public int multiply;
    public int division;

    public void start(){
        Calculator usingOfCalculator = new Calculator();
        while(true) {
            System.out.println("Calculator is ready!\nEnter some simbols");;
            Scanner newScanner = new Scanner(System.in);
            String value1 = newScanner.nextLine();
            if(value1.contentEquals("Stop"))
            {
                System.out.println("Калькулятор закрыт");
                break;
            }
            int slashPosition = value1.indexOf('/');
            int starPosition = value1.indexOf('*');
            int plusPosition = value1.indexOf('+');
            int minusPosition = value1.indexOf('-');



            if (slashPosition > -1) {
                String[] arrayValue = value1.split("/");
                double valueOneForDivision = Double.parseDouble(arrayValue[0]);
                double valueTwoForDivision = Double.parseDouble(arrayValue[1]);
                System.out.println(usingOfCalculator.getDivision(valueOneForDivision, valueTwoForDivision));
                continue;
            } else if (starPosition > -1) {
                String[] arrayValue = value1.split("\\*");
                double valueOneForMultiply = Double.parseDouble(arrayValue[0]);
                double valueTwoForMultiply = Double.parseDouble(arrayValue[1]);
                System.out.println(usingOfCalculator.getMultiply(valueOneForMultiply, valueTwoForMultiply));
                continue;
            } else if (plusPosition > -1) {
                String[] arrayValue = value1.split("\\+");
                double valueOneForSumm = Double.parseDouble(arrayValue[0]);
                double valueTwoForSumm = Double.parseDouble(arrayValue[1]);
                System.out.println(usingOfCalculator.getSumm(valueOneForSumm, valueTwoForSumm));
                continue;
            } else if (minusPosition > -1) {
                String[] arrayValue = value1.split("-");
                double valueOneForMinus = Double.parseDouble(arrayValue[0]);
                double valueTwoForMinus = Double.parseDouble(arrayValue[1]);
                System.out.println(usingOfCalculator.getMinus(valueOneForMinus, valueTwoForMinus));
                continue;
            } else {
                System.out.println("Введите корректное действие");

            }
        }

    }

    public double getSumm(double summ1, double summ2) {
        double resultSumm = summ1 + summ2;
        return resultSumm;
    }

    public double getMinus(double minus1, double minus2) {
        double resultMinus = minus1 - minus2;
        return resultMinus;
    }

    public double getMultiply(double multiply1, double multiply2) {
        double resultMultiply = multiply1 * multiply2;
        return resultMultiply;
    }

    public double getDivision(double division1, double division2) {
        double resultDivision = division1 / division2;
        return resultDivision;
    }


}
