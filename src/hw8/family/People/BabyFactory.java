package hw8.family.People;

import java.util.Random;


public class BabyFactory {
    static String babyName = "";
    static Sex sex;       // MASCULINE, FEMININE
    static int rnd;

    public static Human deliverABaby(Family family) {
        int babyIq = (family.getFather().getIq() + family.getMother().getIq()) / 2;

        Random random = new Random();
        rnd = random.nextInt(2);
        sex = (rnd == 0) ? Sex.MASCULINE : Sex.FEMININE;
        babyName = GenerateRandomName.get(sex);


        //новая версия свитча  https://betterprogramming.pub/a-look-at-the-new-switch-expressions-in-java-14-ed209c802ba0
//        return switch (sex) {
//            case MASCULINE -> new Man("мальчик: " + babyName, family.getFather().getSurname(), 2021, babyIq, family.getFather().getSchedule(), family);
//            case FEMININE -> new Woman("девочка: " + babyName, family.getFather().getSurname(), 2021, babyIq, family.getFather().getSchedule(), family);
//        };

// старая версия свитча (до  Java 14)
        switch (sex) {
            case MASCULINE:
                return new Man("мальчик: " + babyName, family.getFather().getSurname(), 2021, babyIq, family.getFather().getSchedule(), family);
            case FEMININE:
                return new Woman("девочка: " + babyName, family.getFather().getSurname(), 2021, babyIq, family.getFather().getSchedule(), family);
            default:
                return null;
        }
    }
}
