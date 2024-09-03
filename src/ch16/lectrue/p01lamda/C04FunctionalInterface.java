package ch16.lectrue.p01lamda;

public class C04FunctionalInterface {

}

//Functional Interface
@FunctionalInterface
interface MyInterface4{
    void method1();
}

// x
//@FunctionalInterface
interface MyInterface42 {

}

// x
//@FunctionalInterface
interface MyInterface43 {
    void method1();

    void method2();
}

// @formatter:off
@FunctionalInterface
interface MyInterface44{
    int MAX_VALUE = 100;
    void method1();
    default void method2(){}
    private void method3(){}
    static void method4(){}
    private  static void method5(){}

}
