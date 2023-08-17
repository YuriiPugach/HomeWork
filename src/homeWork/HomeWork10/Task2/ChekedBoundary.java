package homeWork.HomeWork10.Task2;

public class ChekedBoundary extends Exception{
    public String getMessage(){
        return "Значение больше или меньше границы массива";
    }
}
