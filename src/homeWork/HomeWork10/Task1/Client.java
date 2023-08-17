package homeWork.HomeWork10.Task1;

public class Client {
    private String clientName;
    private int age;
    private boolean discount;

    public Client(String clientName, int age, boolean discount) {
        this.clientName = clientName;
        this.age = age;
        this.discount = discount;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
