package homeWork.HomeWork10.Task3;

import java.util.Scanner;

public class Father {
    private String name;
    private int moneyInThePocket;


    public Father(String name, int moneyInThePoсket) {
        this.name = name;
        this.moneyInThePocket = moneyInThePoсket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyInThePoсket() {
        return moneyInThePocket;
    }

    public void setMoneyInThePoсket(int moneyInThePoсket) {
        this.moneyInThePocket = moneyInThePoсket;
    }
    public void buyProducts(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many potato would you like to buy?");
        int potato = scanner.nextInt();

        System.out.println("How many milk would you like to buy?");
        int milk = scanner.nextInt();

        System.out.println("How many apple would you like to buy?");
        int apple = scanner.nextInt();

        System.out.println("How many tobako would you like to buy?");
        int tobako = scanner.nextInt();

        System.out.println("How many beer would you like to buy?");
        int beer = scanner.nextInt();


        if (potato%3!=0 || apple%3!=0 || milk%3!=0 || tobako>0 || beer>0  ){
            System.out.println("Прийдешь домой получишь по шее");
        }
        else if (moneyInThePocket > Products.POTATO.getCostOfProduct()*potato + Products.MILK.getCostOfProduct()*milk
                + Products.APPLE.getCostOfProduct()*apple + Products.TOBAKO.getCostOfProduct()*tobako
                + Products.BEER.getCostOfProduct()*beer){
            System.out.println("Уважаемый Валентин стоимость ваших покупок "+ (Products.POTATO.getCostOfProduct()*potato + Products.MILK.getCostOfProduct()*milk
                    + Products.APPLE.getCostOfProduct()*apple + Products.TOBAKO.getCostOfProduct()*tobako
                    + Products.BEER.getCostOfProduct()*beer) + ", ");
        if (potato>0) {
            System.out.println("Вы приобрели Potato в количестве "+ potato ); }
             if (milk>0){
                System.out.println("Вы приобрели Milk в количестве "+milk );}
             if (apple>0){
                System.out.println("Вы приобрели Apple в количестве "+ apple );}
             if(tobako>0){
                System.out.println("Вы приобрели Tobako в количестве "+tobako );}
             if(tobako>0){
                System.out.println("Вы приобрели Beer в количестве "+beer );}

        } else

         {
             System.out.println("У вас недостаточно денег");
        }
    }

}
