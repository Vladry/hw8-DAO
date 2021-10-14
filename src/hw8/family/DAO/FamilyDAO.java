package hw8.family.DAO;

import java.util.List;

public interface FamilyDAO<T> {

    public List<T> getAllFamilies();
    public T getFamilyByIndex(int i);
    public boolean deleteFamily(int i);
    public boolean deleteFamily(T o);
    public boolean saveFamily(T o);
}
