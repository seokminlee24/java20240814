package ch16.lectrue.p01lamda;

public class C01Anonymous {
    public static void main(String[] args) {
        MyInterface1 o = new MyInterface1() {
            @Override
            public void method1() {
                System.out.println("C01Anonymous.method1");
            }

            @Override
            public void method2() {
                System.out.println("C01Anonymous.method2");
            }
        };
        o.method1();
        o.method2();
    }
}

interface MyInterface1{
    void method1();
    void method2();
}