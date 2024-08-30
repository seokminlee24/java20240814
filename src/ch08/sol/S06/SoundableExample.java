package ch08.sol.S06;

public class SoundableExample {
    public  static void  printSound(SoundAble soundAble){
        System.out.println(soundAble.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}

interface SoundAble{
    String sound();
}
class Cat implements SoundAble{
    @Override
    public String sound() {
        return "냥냥";
    }
}

class Dog implements SoundAble{
    @Override
    public String sound() {
        return "멍멍";
    }
}

