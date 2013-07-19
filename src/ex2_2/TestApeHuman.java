package ex2_2;

/**
 *
 * @author vanting
 */
public class TestApeHuman {

    public static void main(String[] args) {
        Human human = new Human(10, 50, 0);
        Ape ape = new Ape(10, 50);

        whoDieFirst(ape, human);

    }

    public static void whoDieFirst(Ape ape, Human human) {
        while(ape.energy > 0 && human.energy > 0) {
            ape.hunt();
            ape.eat();

            human.hunt();
            human.study();
            human.eat();

            System.out.println("Ape: e:" + ape.energy + " f:" + ape.food);
            System.out.println("Human: e:" + human.energy + " f:" + human.food + " i:" + human.intelligence);
            System.out.println("");
        }
    }

}
