package ch06.lectrue.p05static;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.method();
        o1.method1();
    }
}
class MyClass03{
    //instance method
    void method(){
        System.out.println("MyClass03.method");
    }

    //static field(class field, 정적 필드)
    static void method1(){
        System.out.println("MyClass03.method1");
    }
}
