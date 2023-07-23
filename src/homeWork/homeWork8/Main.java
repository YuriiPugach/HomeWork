package homeWork.homeWork8;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Oak");
        Tree tree3 = new Tree("Some type of tree",150);
        Tree tree4 = new Tree(160,33, "Wood colour");
        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
        System.out.println(tree4.toString());
    }
}
