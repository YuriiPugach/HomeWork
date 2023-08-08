package homeWork.homeWork9;

public class Main {
            public static void main(String[] args) {
                Pet pet1 = new Pet("dog", "Potato", 5, 75, new String[]{"eat", "drink", "sleep"});
                Pet pet2 = new Pet("cat", "Batato");

                Human mother1 = new Human("Jane", "Karleone", 1970);
                Human father1 = new Human("Vito", "Karleone", 1965);

                Human mother2 = new Human("Francheska", "Bunitto", 1985);
                Human father2 = new Human("Viktor", "Skalette", 1980);


                Human firstChild = new Human("Marko", "Karleone", 1995, mother1, father1);
                Human secondChild = new Human("Polo", "Karleone", 2000, 105, mother1, father1, pet1);

                Human thirdChild = new Human("Paolo", "Skalette", 2000, 108, mother2, father2, pet2);

                Family family1 = new Family(mother1, father1);
                Family family2 = new Family(mother2, father2);
                family1.addChild(firstChild);
                family1.addChild(secondChild);
                family2.addChild(thirdChild);

                System.out.println(family1);
                System.out.println(mother1);
                System.out.println(family1);
                System.out.println(firstChild);
                System.out.println(secondChild);
                secondChild.describePet();
                System.out.println("========================");
                System.out.println(family2);
                System.out.println(mother2);
                System.out.println(father2);
                System.out.println(thirdChild);
                thirdChild.describePet();
            }
}
