package ex2_3;

public class InterfaceDemo {

    public static void main(String[] args) {
        Yelling[] animals = {new Cat(), new Dog()};
        poke(animals);
    }

    public static void poke(Yelling[] animals) {
        for(int i=0; i<animals.length; i++)
            animals[i].yell();
    }
}

class Cat implements Yelling {

    @Override
    public void yell() {
        System.out.println("MeoMeo");
    }
}

class Dog implements Yelling {

    @Override
    public void yell() {
        System.out.println("WooWoo");
    }
}
