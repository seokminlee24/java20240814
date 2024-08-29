package ch07.lecture.p03polymorphism;

public class C08polymorphism {
    public static void main(String[] args) {
        Fish8 f = new Fish8();
        Bear8 b = new Bear8();
        living(f);
        living(b);
    }

    public static void living(Animal8 a){
        a.breathe();
        //a.swim();
        //a.hunt();
    }
}

class  Animal8{
    public  void  breathe(){
        System.out.println("동물이 숨쉰다.");
    }
}

class Fish8 extends Animal8{
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim(){
        System.out.println("수영한다.");
    }
}

class Bear8 extends Animal8{
    @Override
    public void breathe() {
        System.out.println("페 호흡");
    }
    public void hunt(){
        System.out.println("수영한다.");
    }
}
