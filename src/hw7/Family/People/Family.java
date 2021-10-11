package hw7.Family.People;

import hw7.Family.Animals.Pet;

import java.util.ArrayList;
import java.util.List;

import static hw7.Family.People.BabyFactory.deliverABaby;

public class Family implements HumanCreator {

    private Human mother;
    private Human father;
    private final List<Human> children;
    private Pet pet;

    static {
        System.out.println("загружается новый класс Family");
    }

    {
        this.children = new ArrayList<>();
        System.out.println("создается новый объект Family");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Human bornChild() {
        return deliverABaby(this);
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.size() || children.get(index) == null) {
            return false;
        }
        children.remove(index);
        return true;

    }

    public int countFamily(int numOfChildren) {
        return numOfChildren + 2;
    }

    public Human getMother() {
        return this.mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return this.father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List getChildren() {
        return this.children;
    }

    public void setChildren(Human child) {
        child.setFamily(this);
        addChild(child);
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{\n mother= " + mother +
                "father= " + father +
                "children= " + children.toString() + "\n" +
                "pet= " + pet +
                "}\n ";
    }

    @Override
    protected void finalize() {
        System.out.println("Deleting an instance of Family");
    }
}

