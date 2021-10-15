package hw8.family.service;

import hw8.family.People.Family;
import hw8.family.People.Human;

import java.util.List;

public interface Services {

    //-получим от FamilyDAO:   List<Family> getAllFamilies();//получить список всех семей
    void displayAllFamilies(); //вывести на экран все семьи (в индексированном списке) со всеми членами семьи.
    List<Family> getFamiliesBiggerThan(int num);//найти семьи с количеством людей больше чем (принимает количество человек и возвращает все семьи где количество людей больше чем указанное); выводит информацию на экран.
    List<Family> getFamiliesLessThan(int num);//найти семьи с количеством людей меньше чем (принимает количество человек и возвращает все семьи где количество людей меньше чем указанное); выводит информацию на экран.
    int countFamiliesWithMemberNumber(int num);//подсчитать число семей с количеством людей равное переданному числу.
    boolean createNewFamily(String dadName, String momName, String lastName,
                            int dadBirthYear, int momBirthYear, int ownChildren, int adoptedChildren);//создать новую семью (принимает 2 параметра типа Human) - создает новую семью, сохраняет в БД.
    boolean deleteFamilyByIndex(int i);//удалить семью по индексу в списке - удаляет семью из БД.
    boolean bornChild(Family f, String nameDad, String nameMon);//родить семьей ребенка (принимает Family и 2 типа String: мужское и женское имя) - в данной семье появляется новый ребенок с учетом данных родителей, информация о семье обновляется в БД; метод возвращает обновленную семью. Если рожденный ребенок мальчик - ему присваивается мужское имя, если девочка - женское.
    Family adoptChild(Family f, Human h);//усыновить ребенка (принимает 2 параметра: Family, Human)- в данной семье сохраняется данный ребенок, информация о семье обновляется в БД; метод возвращает обновленную семью.
    boolean deleteAllChildrenOlderThen(int quantity);//удалить детей старше чем (принимает int) - во всех семьях удаляются дети, которые старше указанно возраста, информация обновляется в БД.
    int count();//возвращает количество семей в БД.
    Family getFamilyById(int id);//принимает индекс семьи, возвращает Family по указанному индексу.
    boolean getPets();// принимает индекс семьи, возвращает список домашних животных, которые живут в семье.
    boolean addPet();//принимает индекс семьи и параметр Pet - добавляет нового питомца в семью, обновляет данные в БД.

}
