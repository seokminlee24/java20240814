package ch07.sec10.exam02;

public class Cat extends Animal{
    @Override
    public void breathe() {
        System.out.println("고양이가 숨을 쉼니다");
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }

}
