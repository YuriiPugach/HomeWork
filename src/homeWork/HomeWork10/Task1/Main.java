package homeWork.HomeWork10.Task1;

public class Main {
    public static void main(String[] args) {



        Product product = new Product("Garage", true, 150);
        Client client = new Client("Vasiliy", 17, false);
        Cassier cassier = new Cassier("Liudmila", false);
        Shop shop = new Shop("ATB", product, client, cassier);

        shop.returnCost();
    }
}
