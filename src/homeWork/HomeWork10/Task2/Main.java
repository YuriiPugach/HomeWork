package homeWork.HomeWork10.Task2;

public class Main {
    public static void main(String[] args) {
    Numbers ex = new Numbers();
        try {
            ex.main();
        } catch (ChekedBoundary | ChekedNull e) {
            System.out.println(e.getMessage());
        }

    }
}
