package ch06.lectrue.p04costructor;

public class C02Costructor {
    public static void main(String[] args) {
        MyClass02 o =new MyClass02();
        System.out.println(o.name);
        System.out.println(o.age);

    }
}
class MyClass02{
    // 필드
    int age;
    String name;

    // 생성자
    MyClass02() {
        // 인스턴스 생성시 처음해야하는 일
        // 주로 필드 초기화 코드
        age = 1;
        name = "guest";
    }
}
