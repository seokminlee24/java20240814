package ch07.lecture.p01inherintance;

public class C01Inheritance {
    public static void main(String[] args) {
        SubClass02 o = new SubClass02();
    }
}
//상위클래스, 부모 클래스, 슈퍼클래스
class SuperClass01 {
    int age;

    void method1(){
        System.out.println("MyClass01.인스턴스 이니셜라이저");
    }
}

//하위 클래스, 자식클래스, 서브클래스
class SubClass02 extends SuperClass01 {
  //age,method
}
