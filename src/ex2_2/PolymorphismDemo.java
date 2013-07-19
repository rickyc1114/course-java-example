package ex2_2;

public class PolymorphismDemo {

    public static void main(String[] args) {
        // I know nothing about the types of animals, just poke it!
        poke(PetHouse.getSomeAnimals());
    }

    public static void poke(Animal[] animals) {
        for(int i=0; i<animals.length; i++) {
            // dynamically bind to the subtype method
            animals[i].yell();
        }
    }
}


