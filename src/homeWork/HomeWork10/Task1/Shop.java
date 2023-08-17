package homeWork.HomeWork10.Task1;

public class Shop implements Buyable {
private String name;
private Product product;
private Client client;
private Cassier cassier;


    public Shop(String name, Product product, Client client, Cassier cassier) {
        this.name = name;
        this.product = product;
        this.client = client;
        this.cassier = cassier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void returnCost() {
        System.out.println("Уважаемый "+ client.getClientName() + ", "
        + "продавец "+ cassier.getName() +" нашего магазина " + this.name +", "
                + ((cassier.isHonest()!=false && product.isAlcohol()!=false)? " Вам не продаст этот товар." : "продаст вам этот алкогольный товар  "+ product.getName() +", "
                + " ваш возраст "+ client.getAge() + ". "
                + "Стоимость вашей покупки равна "+ ((client.isDiscount()!=false)? "со скидкой 10 процентов "+ product.getProductPrice()*0.9: product.getProductPrice())));
    }
}
