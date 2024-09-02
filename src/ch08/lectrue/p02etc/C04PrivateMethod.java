package ch08.lectrue.p02etc;

public class C04PrivateMethod {

}

interface MyInterface4{
    default void method1(){
        System.out.println("어떤 코딩1");
        extracted();
    }

    default void method2(){
        System.out.println("어떤 코딩4");
        extracted();
    }

    private void extracted(){
        System.out.println("어떤 코드2");
        System.out.println("어떤 코드3");
    }
}
