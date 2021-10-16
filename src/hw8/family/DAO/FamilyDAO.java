package hw8.family.DAO;

import hw8.family.People.Family;

import java.util.List;

public interface FamilyDAO<T> {

    List<T> getAllFamilies();
    T getFamilyByIndex(int i);
    boolean deleteFamily(int i);
    boolean deleteFamily(T o);
    boolean saveFamily(T o);
    boolean deleteChild(int famIndex, int childIndex);
}
