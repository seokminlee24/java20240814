package ch09.lectrue.p02nested;

public class C01Nested {
    public static void main(String[] args) {
        MyClass1 a = new MyClass1();
        MyClass1.Nested1 nested1 = a.new Nested1();

    }
}

class MyClass1{
    //class
    class Nested1{
        //필드
        //생성자
        //메소드
    }

    //필드
    //생성자
    //메소드

    void method1(){
        Nested1 nested1 = new Nested1();
    }

}
