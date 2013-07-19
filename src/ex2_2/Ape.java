
package ex2_2;

/**
 *
 * @author vanting
 */
public class Ape {

    int energy;
    int food;

    Ape(int energy, int food) {
        this.energy = energy;
        this.food = food;
    }

    void eat() {
        if (this.food > 0) {
            this.food--;
            this.energy++;
        }
    }

    void hunt() {
        this.energy--;
        if (Math.random() < 0.5) { // 50% chance
            this.food++;
        }
    }
}
