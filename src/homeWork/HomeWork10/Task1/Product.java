package homeWork.HomeWork10.Task1;

public class Product {
    private String name;
    private boolean isAlcohol;
    private double productPrice;

    public Product(String name, boolean isAlcohol, double productPrice) {
        this.name = name;
        this.isAlcohol = isAlcohol;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
