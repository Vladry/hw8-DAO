package hw7.Family.Animals;

public class Fish extends Pet {

    {
        species = Species.FISH;
    }

    Fish() {
    }

    Fish(String nickname) {
        super(nickname);
    }

    Fish(String nickname, int age, int trickLevel) {
        super(nickname, age, trickLevel);
    }

        public void respond() {
        System.out.println("Привет, я твоя рыба " + this.nickname + ". Рыбы только рот открывают, сорян братан!!!  Пообщайся с RoboCat");
    }

}
