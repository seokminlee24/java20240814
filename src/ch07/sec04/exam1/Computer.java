package ch07.sec04.exam1;

public class Computer extends Calculator {
    @Override
    public double araeaCircle(double r) {
        System.out.println("Computer 객체의 araeaCircle() 실행");
        return Math.PI*r*r;
    }
}
