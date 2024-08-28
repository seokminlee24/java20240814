package ch06.sec13.exam03.package1;

public class B {
    public void method(){
        A a = new A();
        a.field1 = 1; // public
        a.field2 = 1; // package private, default
//        a.field3 = 1; // private

        a.method1(); // public
        a.method2(); // package private, default
//        a.method3(); // private
    }
}

