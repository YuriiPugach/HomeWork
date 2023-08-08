package homeWork.homeWork9;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Human mother;
    private Human father;
    private Pet pet;
    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human() {
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getFather() {
        return father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getMother() {
        return mother;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public class myPet extends Pet{}

    public void greetPet(){
        System.out.println("Привіт "+ pet.getNickname());
    }
    public void describePet(){
        String whoIsSmartBoy = (pet.getTrickLevel()>50)?" дуже хитрий":" майже не хитрий";

        System.out.println("У мене є " + pet.getSpecies() + ", їй "+ pet.getAge() + " років, він "+ whoIsSmartBoy + ".");

    }
    @Override
    public String toString() {
        return "Human{name='" + name +
                "', surname='" + surname +
                "', year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + ((mother != null) ? mother.getName() : "null") +
                ", father=" + ((father != null) ? father.getName() : "null") +
                ", family=" + ((family != null) ? family.getMother().getName() + " and " +
                family.getFather().getName() + "'s family" : "null") + "}";
    }
}
