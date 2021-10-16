package hw8.family.People;

import hw8.family.Animals.Pet;
import hw8.family.DayOfWeek;

import java.util.List;
import java.util.Map;

final public class Woman extends Human {
    Woman(){
        super();
    }

    public Woman(String name, String surname, int year){
        super(name, surname, year);
    }
    public Woman(String name, String surname, int year,
                 int iq, Map<DayOfWeek, List<String>> schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }

    public void makeup (){
        System.out.println("Запущена утрення процедура краски");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println("Хорошая собака, " + pet.getNickname() + ", принеси маме тапочки!");
    }
}
