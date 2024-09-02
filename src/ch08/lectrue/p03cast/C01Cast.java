package ch08.lectrue.p03cast;

public class C01Cast {
    public static void main(String[] args) {
        MyInterface1 o = new MyClass1();
        o.method1();

        //강제형변환(cast)
        MyClass1 p = (MyClass1) o;
        p.method1();
    }
}

//강제타입변환(Cast,Casting) 연산

interface MyInterface1{
    void method1();
}

class MyClass1 implements MyInterface1 {
    @Override
    public void method1() {
        System.out.println("MyClass1.Method1");
    }
}
