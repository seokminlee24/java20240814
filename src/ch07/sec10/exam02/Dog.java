package ch07.sec10.exam02;

public class Dog extends Animal{
    public void breathe() {
        System.out.println("강아지가 숨을 쉼니다");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
