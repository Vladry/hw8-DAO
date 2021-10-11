package hw7.Family.Animals;

public class RoboCat extends Pet {

    {
        species = Species.ROBOCAT;
    }

    RoboCat() {
    }

    RoboCat(String nickname) {
        super(nickname);
    }

    RoboCat(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
    }

    public void respond() {
        System.out.println("Привет, хозяин. Я - " + this.nickname + " твой робоКот. Мышей не ловлю. Тоску разгоняю. Впечатляю. Кипячу воду в стакане термо-лапой");
    }


}
