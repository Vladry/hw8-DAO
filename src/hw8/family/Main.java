package hw8.family;

import hw8.family.Controller.FamilyController;
import hw8.family.DAO.CollectionFamilyDao;
import hw8.family.People.*;
import hw8.family.service.FamilyService;

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
//        System.out.println("всего создано детей: " + totalChildren);
//        System.out.println("из них девочек: " + girlsCounter);
//        System.out.println("number of family members: " + family.countFamily(children.size()));

        Human adoptedChild = new Man("Ilya", family.getFather().getSurname(), 2008);

        CollectionFamilyDao<Family> familyMemStorage = new CollectionFamilyDao<>();//создаём хранилище1
        FamilyService service = new FamilyService(familyMemStorage);
        FamilyController controller = new FamilyController(service);
        service.dao.saveFamily(family);
        controller.FamilyService.displayAllFamilies();
        controller.FamilyService.getFamiliesBiggerThan(2);
        controller.FamilyService.getFamiliesLessThan(5);
        controller.FamilyService.countFamiliesWithMemberNumber(3);
        controller.FamilyService.createNewFamily();
        controller.FamilyService.deleteFamilyByIndex(0);
        controller.FamilyService.bornChild(family, "Sergey", "Zoya");
        controller.FamilyService.adoptChild(family, adoptedChild);
        controller.FamilyService.deleteAllChildrenOlderThen(3);
        controller.FamilyService.count();
        controller.FamilyService.getFamilyById(0);
        controller.FamilyService.getPets();
        controller.FamilyService.addPet();
    }
}



