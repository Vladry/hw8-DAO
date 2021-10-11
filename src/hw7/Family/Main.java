package hw7.Family;

import hw7.Family.People.Family;
import hw7.Family.People.Human;
import hw7.Family.People.Man;
import hw7.Family.People.Woman;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mom = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mom);
        dad.setFamily(family);
        mom.setFamily(family);
        int totalChildren = 3;
        List<Human> children = new ArrayList<>(totalChildren);
        int girlsCounter = 0;
        for (int i = 0; i < totalChildren; i++) {
            children.add(family.bornChild());
            System.out.println(children.get(i).toString());
            if (children.get(i).getName().contains("девочка")) {
                girlsCounter++;
            }
        }
        System.out.println("всего создано детей: " + totalChildren);
        System.out.println("из них девочек: " + girlsCounter);
        System.out.println("number of family members: " + family.countFamily(children.size()));
    }
}



