package hw8.family.DAO;

import java.util.LinkedList;
import java.util.List;

public class CollectionFamilyDao<T> implements FamilyDAO<T> {

    private final List<T> memoryStore;

    {
        memoryStore = new LinkedList<T>();
    }

    public List<T> getAllFamilies() {
        return memoryStore;
    }

    public T getFamilyByIndex(int i) {
        try {
            return memoryStore.get(i);
        } catch (NullPointerException e) {
            return null;
        }
    }

    public boolean deleteFamily(int i) {
        try {
            memoryStore.remove(i);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean deleteFamily(T o) {
        try {
            memoryStore.remove(o);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean saveFamily(T o) {
        if (memoryStore.contains(o)) {
            memoryStore.set(memoryStore.indexOf(o), o);
        } else {
            memoryStore.add(o);
        }
        System.out.println("an object's been stored to: memoryStore");
        return true;
    }
}



