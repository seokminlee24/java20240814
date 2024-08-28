package ch06.lectrue.p08access;

public class C01Aaccess {
    public static void main(String[] args) {
        MyClass o = new MyClass();
        o.method1();
    }
}
class MyClass{
    //필드
    //생성자
    //메소드
    void method1(){
        method2();
    }
    private void method2(){
        System.out.println("다른 곳에서 접근하면 안되는 어떤 일");
    }
}
