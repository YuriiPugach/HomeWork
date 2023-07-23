package homeWork.homeWork8;

public class ReturnComputerInfo {
    public static void main(String[] args) {
//        Task1


        Computer computer1 = new Computer("Seleron", 10000, 128, 64);
        Computer computer2 = new Computer("Seleron", 15000, 128, 64);

        System.out.println(computer1.hashCode());

        System.out.println(computer2.hashCode());

        System.out.println(computer1.equals(computer2));
    }
}
