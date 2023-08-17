package homeWork.HomeWork10.Task3;

import javax.swing.*;

public enum Products {
    POTATO("Potato", 20), MILK("Milk", 50), APPLE("Apple", 30), TOBAKO("Tobako", 100), BEER("Beer", 50);
    private String name;
    private int costOfProduct;

    public String getName() {
        return name;
    }


    public int getCostOfProduct() {
        return costOfProduct;
    }

    Products(String name, int costOfProducts){
        this.name = name;
        this.costOfProduct = costOfProducts;
    }
}
