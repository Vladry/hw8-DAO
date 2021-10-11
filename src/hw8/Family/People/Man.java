package hw8.Family.People;

import hw8.Family.Animals.Pet;
import hw8.Family.DayOfWeek;

import java.util.List;
import java.util.Map;

final public class Man extends Human {

    Man(){
        super();
    }

    public Man(String name, String surname, int year){
        super(name, surname, year);
    }
    Man(String name, String surname, int year,
        int iq, Map<DayOfWeek, List<String>> schedule, Family family){
        super(name, surname, year, iq, schedule, family);
    }

    public void repairCar(){
        System.out.println("Третий год чиним машину");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.println(pet.getNickname() + " , почему тапочки несёшь, ты не домашний рабчик, ты - крутецкий пёс");
    }
}
