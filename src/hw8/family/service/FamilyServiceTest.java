package hw8.family.service;

import hw8.family.Controller.FamilyController;
import hw8.family.DAO.CollectionFamilyDao;
import hw8.family.People.Family;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class FamilyServiceTest {

    FamilyService module = null;

    @Before
    public void init() {
        List<List<String>> familyData = new ArrayList<>(Arrays.asList(
                Arrays.asList("Leontiy", "Zoya", "Fedotov"),
                Arrays.asList("Petya", "Natasha", "Gandzapety"),
                Arrays.asList("Grigory", "Liza", "Morarik"),
                Arrays.asList("Anton", "Olya", "Glory"),
                Arrays.asList("Pavel", "Tanya", "Primetime"),
                Arrays.asList("Viktor", "Lyuba", "Wonder"),
                Arrays.asList("Marik", "Katya", "Pendik"),
                Arrays.asList("Svyatoslav", "Tonya", "Krutovar"),
                Arrays.asList("Vladik", "Lena", "Mirolyub"),
                Arrays.asList("Sergey", "Nadya", "Rudakov"),
                Arrays.asList("Maks", "Rebekka", "Petrik"),
                Arrays.asList("Vladymir", "Nyura", "Levinsky"),
                Arrays.asList("Yura", "Klavdia", "Shifer"),
                Arrays.asList("Taras", "Marta", "Mirolyub"),
                Arrays.asList("Vovan", "Galya", "Gagik"),
                Arrays.asList("Vertal", "Alla", "Pendiks")
        )
        );

        CollectionFamilyDao<Family> familyMemStorage = new CollectionFamilyDao<>();
        module = new FamilyService(familyMemStorage);
        FamilyController controller = new FamilyController(module);
        //задание прочих входных параметров для создания семей:
        Random rnd = new Random();
        int amntOwn, amntAdopted, dadBirthYear, momBirthYear;

        for (List<String> names : familyData) {
            amntOwn = 4;
            amntAdopted = 3;
            dadBirthYear = 1970;
            momBirthYear = 1980;

            //создание семей и испытании метода createNewFamily():
            module.createNewFamily(names.get(0), names.get(1), names.get(2),
                    dadBirthYear, momBirthYear, amntOwn, amntAdopted);
        }
    }

//    @After
//    public void cleanUp() {
//        familyData = null;
//        familyMemStorage = null;
//        service = null;
//        controller = null;
//    }

    @Test
    public void displayAllFamilies() {

    }

    @Test
    public void testCountFamiliesWithMemberNumberSuccessful() {
        int expected = 16;
        int result = module.countFamiliesWithMemberNumber(9);
        assertEquals(expected, result);
    }

    @Test
    public void testCountFamiliesWithMemberNumberUnSuccessful() {
        int expected = 16;
        int result = module.countFamiliesWithMemberNumber(6);
        assertNotEquals(expected, result);
    }

    @Test
    public void createNewFamily() {
    }

    @Test
    public void deleteFamilyByIndex() {
    }

    @Test
    public void bornChild() {
    }

    @Test
    public void adoptChild() {
    }

    @Test
    public void deleteAllChildrenOlderThen() {
    }

    @Test
    public void count() {
    }

    @Test
    public void addPet() {
    }
}