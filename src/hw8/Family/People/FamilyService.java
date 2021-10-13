package hw8.Family.People;

import java.util.List;

public class FamilyService implements Services, FamilyDAO<T> {

    List<Family> getAllFamilies(){};
    String displayAllFamilies(){};
    List<Family> getFamiliesBiggerThan(){};
    List<Family> getFamiliesLessThan(){};
    int countFamiliesWithMemberNumber(){};
    boolean createNewFamily(){};
    boolean deleteFamilyByIndex(){};
    boolean bornChild(){};
    Family adoptChild(){};
    boolean deleteAllChildrenOlderThen(){};
    int count(){};
    Family getFamilyById(){};
    boolean addPet(){};

}
