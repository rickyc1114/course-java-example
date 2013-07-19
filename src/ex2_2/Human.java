package ex2_2;

/**
 *
 * @author vanting
 */
public class Human extends Ape {

    // energy and food are inherited from Ape

    // intelligence is additional data field for
    double intelligence;

    Human(int energy, int food, double intelligence) {
        super(energy, food);                // call super-constructor
        this.intelligence = intelligence;
    }

    // method eat() is also inherited from Ape

    // this method is addition feature for Human
    void study() {
        if(this.energy > 0 && this.intelligence < 0.5) {
            this.energy--;
            this.intelligence += 0.05;
        }
    }

    // this method override the hunt() from Ape
    @Override
    void hunt() {
        this.energy--;
        if(Math.random() < 0.5 + this.intelligence)
            this.food++;
    }
}
