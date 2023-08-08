package homeWork.homeWork9;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Pet pet;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void addPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return species +
                ", nickname= " + nickname +
                ", age= " + age +
                ", trickLevel= " + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                ']';
    }

    public void eat() {
        System.out.println("Я Їм!");
    }

    public void respond() {
        System.out.println("Привіт, хозяїн. Я " + nickname + ". Я скучив!");
    }

    public void foul() {
        System.out.println("Потрібно добре замести сліди...");
    }
}
