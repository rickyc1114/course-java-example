/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_2;

/**
 *
 * @author vanting
 */
public class PetHouse {
    
    public static Animal[] getSomeAnimals() {
        Animal[] someAnimals = {new Animal(), new Cat(), new Dog()};
        return someAnimals;
    }
}

class Animal {
    public void yell() {
        System.out.println("**undefined**");
    }
}

class Cat extends Animal {   
    
    @Override
    public void yell() {
        System.out.println("MeoMeo");
    }
    
}

class Dog extends Animal {
    @Override
    public void yell() {
        System.out.println("WooWoo");
    }
}