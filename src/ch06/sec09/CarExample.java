package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar =new Car("포르쉐");
        Car myCar1 =new Car("벤츠");

        myCar.run();
        myCar1.run();
    }
}
class Car{
    String model;
    int speed;

    Car(String model){
        this.model=model;
    }

    void setSpeed(int speed){
        this.speed =speed;
    }
    void run(){
        this.setSpeed(100);
        System.out.println(STR."\{this.model}가 달립니다.(시속 \{this.speed} km/h)");
    }
}
