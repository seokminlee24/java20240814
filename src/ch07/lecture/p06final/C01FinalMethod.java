package ch07.lecture.p06final;

public class C01FinalMethod {
    public static void main(String[] args) {
        Domi1 domi1 = new Domi1();
        domi1.swim();
        domi1.breathe1();

        Tuna1 tuna1 = new Tuna1();
        tuna1.swim();
        tuna1.breathe1();
    }

}

class Fish1{
    public void breathe1(){
        System.out.println("페호흡 합니다");
    }
    public void swim(){
        System.out.println("수영합니다.");
    }
}

class Domi1 extends Fish1{
    // 안되도록 !!
//    @Override
//    public void breathe() {
//        System.out.println("폐호흡니다.");
//    }


    @Override
    public void swim() {
        System.out.println("천천이 헤엄칩니다.");
    }
}

class Tuna1 extends Fish1 {

    @Override
    public void swim() {
        System.out.println("빠르게 헤엄칩니다.");
    }
}
