package homeWork.homeWork9;


public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;



    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        mother.setFamily(this);
        father.setFamily(this);
    }


    public void addChild(Human child) {
        Human[] updatedChildren = new Human[children.length + 1];
        System.arraycopy(children, 0, updatedChildren, 0, children.length);
        updatedChildren[children.length] = child;
        children = updatedChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }

        Human[] updatedChildren = new Human[children.length - 1];
        System.arraycopy(children, 0, updatedChildren, 0, index);
        System.arraycopy(children, index + 1, updatedChildren, index, children.length - index - 1);
        children = updatedChildren;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder childrenArray = new StringBuilder();
        for (int i = 0; i < children.length; i++) {
            childrenArray.append(children[i].getName());
            if (i < children.length - 1) {
                childrenArray.append(", ");
            }
        }
        String childrenStr = (childrenArray.length() > 0) ? childrenArray.toString() : "No children";
        return "Family{" +
                "mother=" + mother.getName() +
                ", father=" + father.getName() +
                ", children=[" + childrenStr + "]" +
                ", pet=" + ((pet != null) ? pet.getNickname() : "null") +
                "}";
    }

}
