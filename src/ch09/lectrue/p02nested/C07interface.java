package ch09.lectrue.p02nested;

public class C07interface {
    public static void main(String[] args) {
        MyClass7.Nested7 o = new MyClass7.Nested7() {
        };
    }
}

class MyClass7{
    //nested interface (중첩된 interface)
    //static 생략가능
    static interface Nested7{
    }
    void someMethod(){
        Nested7 o = new Nested7() {
        };
    }
}

interface MyInterface7{

}
