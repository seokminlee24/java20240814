package ch08.sec10.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = b; //B 자동타입
        a = c; //C
        a = d; //D
        a = e; //E
    }
}
