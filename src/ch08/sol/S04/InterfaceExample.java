package ch08.sol.S04;

public class InterfaceExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        A a;
        b.method(new B());
        c.method(new C());
        d.method(new D());
        e.method(new E());
    }
}
