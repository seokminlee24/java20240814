package ch07.sec03.exam01;

public class Smartphone extends Phone {
    public Smartphone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행됨");
    }
}
