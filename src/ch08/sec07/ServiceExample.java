package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();

    }
}

interface Service{
    default void defaultMethod1(){
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("staticMethod 중복 코드 A");
        System.out.println("staticMethod 중복 코드 B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }
}

class ServiceImpl implements Service{

}