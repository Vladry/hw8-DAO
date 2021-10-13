package hw8.Family.People;

import java.util.List;
import java.util.Optional;

public interface FamilyDAO<T> {

    public List<T> getAllFamilies();
    public T getFamilyByIndex(int i);
    public boolean deleteFamily(int i);
    public boolean deleteFamily(T o);
    public boolean saveFamily(T o);
}
