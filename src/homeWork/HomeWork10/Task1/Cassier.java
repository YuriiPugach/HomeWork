package homeWork.HomeWork10.Task1;

public class Cassier {
    private String name;
    private boolean honest;

    public String getName() {
        return name;
    }

    public Cassier(String name, boolean honest) {
        this.name = name;
        this.honest = honest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }
}
