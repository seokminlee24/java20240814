package ch08.lectrue.p01interface;

public class C03AbstractMethod {
    public static void main(String[] args) {
        MyInterface3 o = new MyClass3();
        o.someMethod();
        o.otherMethod();
        o.otherMethod2();
        o.otherMethod3();
    }
}

interface MyInterface3{
    //인터페이스의 메소드는 public abstract 메소드
    public abstract void someMethod();

    abstract void otherMethod();

    abstract void otherMethod2();

    void otherMethod3();
}

class MyClass3 implements MyInterface3{
    @Override
    public void someMethod() {

    }

    @Override
    public void otherMethod() {

    }

    @Override
    public void otherMethod2() {

    }

    @Override
    public void otherMethod3() {

    }
}
