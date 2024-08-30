package ch07.lecture.p05abstract;

public class C01AbstractClass {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        horse1.work();

        Bear1 bear1 = new Bear1();
        bear1.work();

       // Mammal1 m1 = new Mammal1();
    }
}

//abstract class
//인스턴스 생성하지 못하는 클래스

//포요류
abstract class Mammal1{
    public void work(){
        System.out.println("걷다");
    }
}

class Horse1 extends Mammal1{
    @Override
    public void work() {
        System.out.println("말이 걷다");
    }
}

class Bear1 extends Mammal1{
    @Override
    public void work() {
        System.out.println("곰이 걷다");
    }
}

