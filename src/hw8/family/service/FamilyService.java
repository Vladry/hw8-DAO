package hw8.family.service;

import hw8.family.DAO.FamilyDAO;
import hw8.family.People.Family;
import hw8.family.People.Human;
import hw8.family.People.Man;
import hw8.family.People.Woman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FamilyService implements Services {
    public FamilyDAO<Family> dao;

    private void famCreationReport(int totalChildren, int girlsCounter, int famCount) {
        System.out.println("всего создано детей: " + totalChildren);
        System.out.println("из них девочек: " + girlsCounter);
        System.out.println("number of family members: " + famCount);
    }

    public FamilyService(FamilyDAO<Family> dao) {
        this.dao = dao;
    }

    ;

    public void displayAllFamilies() {
        System.out.println("all families to screen: ");
        List<Family> f = dao.getAllFamilies();
        System.out.println(f);
    }

    ;

    public List<Family> getFamiliesBiggerThan(int num) {
        System.out.println("FamiliesBiggerThan to screen");
        List<Family> listFam = dao.getAllFamilies();
        List<Family> result = new ArrayList<>();
        for (Family f : listFam) {
            if (f.getChildren().size() + 2 > num) {
                result.add(f);
                return result;
            }
            ;
        }
        return listFam;
    }

    ;

    public List<Family> getFamiliesLessThan(int num) {
        System.out.println("FamiliesLessThan to screen: ");
        List<Family> listFam = dao.getAllFamilies();
        List<Family> result = new ArrayList<>();
        for (Family f : listFam) {
            if (f.getChildren().size() + 2 < num) {
                result.add(f);
            }
        }
        return result;
    }

    public int countFamiliesWithMemberNumber(int num) {
        System.out.println("FamiliesWithMemberNumber: ");
        List<Family> listFam = dao.getAllFamilies();
        List<Family> result = new ArrayList<>();
        for (Family f : listFam) {
            if (f.getChildren().size() + 2 == num) {
                result.add(f);
            }
        }
        return result.size();
    }


    public boolean createNewFamily(String dadName, String momName, String lastName,
                                   int dadBirthYear, int momBirthYear, int ownChildren, int adoptedChildren) {
        Human dad = new Man(dadName, lastName, dadBirthYear);
        Human mom = new Woman(momName, lastName + "a", momBirthYear);
        Family family = new Family(dad, mom);
        dad.setFamily(family);
        mom.setFamily(family);
        List<Human> children = new ArrayList<>(ownChildren);
        int girlsCounter = 0;


        for (int i = 0; i < ownChildren; i++) {

            children.add(family.bornChild());
            System.out.println(children.get(i).toString());
            if (children.get(i).getName().contains("девочка")) {
                girlsCounter++;
            }
        }
        Human adoptedChild = new Man("Ilya", family.getFather().getSurname(), 2008);

        famCreationReport(ownChildren, girlsCounter, family.countFamily(children.size()));

        dao.saveFamily(family);

        bornChild(family, "Sergey", "Zoya");
        adoptChild(family, adoptedChild);


        return false;
    }

    ;

    public boolean deleteFamilyByIndex(int i) {
        return false;
    }

    ;

    public boolean bornChild(Family f, String nameDad, String nameMon) {
        return false;
    }

    ;

    public Family adoptChild(Family f, Human h) {
        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mom = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mom);
        return family;
    }

    ;

    public boolean deleteAllChildrenOlderThen(int quantity) {
        return false;
    }

    ;

    public int count() {
        return 0;
    }

    public Family getFamilyById(int id) {
        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mom = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mom);
        return family;
    }

    public boolean getPets() {
        return false;
    }

    public boolean addPet() {
        return false;
    }

    ;

}
