package homeWork.homeWork8;

public class Tree {
    public String type;
    public int height;
    public int countOfSticks;
    public String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Зеленый";
    }

    public Tree(int height, int countOfSticks, String colour) {
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.type = "Пихта";
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Желтый";
    }

    public Tree(String type) {
        this.type = type;
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Желтый";
    }
    @Override
    public String toString() {
        return "Tree info{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", countOfSticks=" + countOfSticks +
                ", colour=" + colour +
                '}';
    }
}
