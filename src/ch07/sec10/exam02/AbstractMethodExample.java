package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.breathe();
        Cat cat = new Cat();
        cat.sound();
        cat.breathe();

        animalSound(new Dog());
        animalBreathe(new Dog());
        animalSound(new Cat());
        animalBreathe(new Cat());
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
    public static void animalBreathe(Animal animal){
        animal.breathe();
    }
}
