package hw8.family.People;

import java.util.Random;


public class BabyFactory {
    static String babyName = "";
    static Sex sex;       // MASCULINE, FEMININE
    static int rndSex, birthYear;

    public static Human deliverABaby(Family family) {
        int babyIq = (family.getFather().getIq() + family.getMother().getIq()) / 2;

        Random random = new Random();
        rndSex = random.nextInt(2);
        birthYear = random.nextInt(10) + 2010;
        sex = (rndSex == 0) ? Sex.MASCULINE : Sex.FEMININE;
        babyName = GenerateRandomName.get(sex);

        switch (sex) {
            case MASCULINE:
                return new Man("мальчик: " + babyName, family.getFather().getSurname(), birthYear, babyIq, family.getFather().getSchedule(), family);
            case FEMININE:
                return new Woman("девочка: " + babyName, family.getFather().getSurname(), birthYear, babyIq, family.getFather().getSchedule(), family);
            default:
                return null;
        }
    }
}
