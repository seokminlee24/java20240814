package ch08.lectrue.p01interface;

public class C05Polymorphism {
    public static void main(String[] args) {
        MyInterface5 m = method();
        m.someAction();
    }
    static MyInterface5 method(){
        double r = Math.random();
        if (r<0.5){
            return new MyClass51();
        }else{
            return new MyClass52();
        }
    }
}

interface MyInterface5{
    void someAction();
}

class MyClass51 implements MyInterface5{
    @Override
    public void someAction() {
        System.out.println("MyClass51.someAction");
    }
}

class MyClass52 implements MyInterface5{
    @Override
    public void someAction() {
        System.out.println("MyClass52.someAction");
    }
}