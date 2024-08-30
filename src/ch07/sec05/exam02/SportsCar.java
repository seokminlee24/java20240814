package ch07.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }
    //오버라이딩 못함
//    public void stop(){
//        System.out.println("스포츠카 멈춤");
//        speed = 0;
//    }
}
