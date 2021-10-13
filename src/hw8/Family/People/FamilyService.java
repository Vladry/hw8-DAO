package hw8.Family.People;

import java.util.List;

public class FamilyService extends CollectionFamilyDao<Family> implements Services {

    public String displayAllFamilies(){};
    public List<Family> getFamiliesBiggerThan(){};
    public List<Family> getFamiliesLessThan(){};
    public int countFamiliesWithMemberNumber(){};
    public boolean createNewFamily(){};
    public boolean deleteFamilyByIndex(){};
    public boolean bornChild(){};
    public Family adoptChild(){};
    public boolean deleteAllChildrenOlderThen(){};
    public int count(){};
    public Family getFamilyById(){}
    public boolean getPets() {
        return false;
    }
    public boolean addPet(){};

}
