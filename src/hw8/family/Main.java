package hw8.family;

import hw8.family.Controller.FamilyController;
import hw8.family.DAO.CollectionFamilyDao;
import hw8.family.People.Family;
import hw8.family.service.FamilyService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //исходник с данными по создаваемым семьям:
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

        //создание сервиса DAO:
        CollectionFamilyDao<Family> familyMemStorage = new CollectionFamilyDao<>();//создаём хранилище1
        FamilyService service = new FamilyService(familyMemStorage);
        FamilyController controller = new FamilyController(service);

        //задание прочих входных параметров для создания семей:
        Random rnd = new Random();
        int amntOwn, amntAdopted, dadBirthYear, momBirthYear;

        for (List<String> names : familyData) {
            amntOwn = rnd.nextInt(4);
            amntAdopted = rnd.nextInt(3);
            dadBirthYear = rnd.nextInt(10) + 1970;
            momBirthYear = rnd.nextInt(30) + 1970;


            //создание семей и испытании метода createNewFamily():
            service.createNewFamily(names.get(0), names.get(1), names.get(2),
                    dadBirthYear, momBirthYear, amntOwn, amntAdopted);
        }


        controller.doControl();

    }
}



