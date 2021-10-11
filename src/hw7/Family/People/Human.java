package hw7.Family.People;

import hw7.Family.Animals.Pet;
import hw7.Family.DayOfWeek;

import java.util.*;

public abstract class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeek, List<String>> schedule;
    private Family family;

    static {
        System.out.println("загружается новый класс Human");
    }

    {

        schedule = new HashMap<>();

        for (DayOfWeek weekDay : DayOfWeek.values()) {
            List<String> tasks = new ArrayList<>();
            schedule.put(weekDay, tasks);
        }


//        System.out.println("создается новый объект Human");
        Random rnd = new Random();
        iq = rnd.nextInt(101);
    }

    Human() {
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year,
          int iq, Map<DayOfWeek, List<String>> schedule, Family family) {
        this(name, surname, year);
        this.iq = iq;
        this.schedule.putAll(schedule);
        this.family = family;
    }


    public void greetPet(Pet pet) {
        System.out.println("Привет, " + pet.getNickname());
    }

    public void describePet(Pet pet) {
        String trickVerdict;
        if (pet.getTrickLevel() > 50) {
            trickVerdict = "очень хитрый";
        } else {
            trickVerdict = "почти не хитрый";
        }

        System.out.println("У меня есть " +
                pet.getSpecies() +
                ", ему " +
                pet.getAge() +
                " лет, он +" +
                trickVerdict
        );

    }

    public String getName() {
        return this.name;
    }

    ;

    public void setName(String name) {
        this.name = name;
    }

    ;

    public String getSurname() {
        return this.surname;
    }

    ;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    ;

    public int getYear() {
        return this.year;
    }

    ;

    public void setYear(int year) {
        this.year = year;
    }

    ;

    public int getIq() {
        return this.iq;
    }

    ;

    public void setIq(int iq) {
        this.iq = iq;
    }

    ;

    public Map<DayOfWeek, List<String>> getSchedule() {
        return this.schedule;
    }

    ;

    public void setSchedule(Map<DayOfWeek, List<String>> schedule) {
        this.schedule = schedule;
    }

    ;

    public Family getFamily() {
        return this.family;
    }

    ;

    public void setFamily(Family family) {
        this.family = family;
    }


    @Override
    public String toString() {
        return "Human{ name=" + this.getName() + ", surname= " + this.getSurname() +
                ", year=" + this.getYear() + ", iq=" + this.getIq() +
//                ", family=" + this.getFamily().toString() +
                ", schedule=" + this.getSchedule().toString() +
                "} \n ";
    }

    @Override
    protected void finalize() {
        System.out.println("Deleting an instance of Human");
    }
}
