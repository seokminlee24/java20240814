package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        //car 객체 생성
        Car myCar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("제작회사 = " + myCar.company);
        System.out.println("모델명 = " + myCar.model);
        System.out.println("컬러 = " + myCar.color);
        System.out.println("최고속도 = " + myCar.maxSpped);
        System.out.println("현재속도 = " + myCar.spped);

        //Car 객체의 필드 값 변경
        myCar.spped = 60;
        System.out.println("수정된 속도 = " + myCar.spped);
    }
}

