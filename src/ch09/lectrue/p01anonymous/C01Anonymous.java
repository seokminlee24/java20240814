package ch09.lectrue.p01anonymous;

public class C01Anonymous {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.someMethod();

        Child1 c = new Child1();
        c.someMethod1();

        //anonymous class
        //상속받아서 새클래스 만들고
        // + 인스턴스 생성
        Parent1 a = new Parent1(){
        //자식클래스 코드들
        // : 필드, 메소드

            @Override
            public void someMethod() {
                System.out.println("C01Anonymous.someMethod");
            }
        };
        a.someMethod();
    }
}

class Parent1{
    public void someMethod(){
        System.out.println("Parent1.someMethod");
    }
}

class Child1 extends Parent1{
    public void someMethod1(){
        System.out.println("Child1.someMethod");
    }
}
