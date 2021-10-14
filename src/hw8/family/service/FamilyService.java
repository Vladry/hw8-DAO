package hw8.family.service;

import hw8.family.DAO.FamilyDAO;
import hw8.family.People.Family;
import hw8.family.People.Human;
import hw8.family.People.Man;
import hw8.family.People.Woman;

import java.util.ArrayList;
import java.util.List;

public class FamilyService implements Services {

    public FamilyDAO<Family> dao;

    public FamilyService(FamilyDAO<Family> dao){
        this.dao = dao;
    };
    public String displayAllFamilies(){
        System.out.println("all families to screen"); return ""; };
    public List<Family> getFamiliesBiggerThan(int num){
        System.out.println("FamiliesBiggerThan to screen");
        List<Family> listFam = new ArrayList<>();
        return listFam;
    };
    public List<Family> getFamiliesLessThan(int num){
        System.out.println("FamiliesLessThan to screen");
        List<Family> listFam = new ArrayList<>();
        return listFam;
    };
    public int countFamiliesWithMemberNumber(int num){return 0;};
    public boolean createNewFamily(){return false;};
    public boolean deleteFamilyByIndex(int i){return false;};
    public boolean bornChild(Family f, String nameDad, String nameMon){return false;};
    public Family adoptChild(Family f, Human h){
        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mom = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mom);
        return family;
    };
    public boolean deleteAllChildrenOlderThen(int quantity){return false;};
    public int count(){return 0;}
    public Family getFamilyById(int id){
        Human dad = new Man("Sergey", "Ivankov", 1980);
        Human mom = new Woman("Zoya", "Ivankova", 1985);
        Family family = new Family(dad, mom);
        return family;
    }
    public boolean getPets() {
        return false;
    }
    public boolean addPet(){return false;};

}