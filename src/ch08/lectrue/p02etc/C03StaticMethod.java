package ch08.lectrue.p02etc;

public class C03StaticMethod {
    public static void main(String[] args) {
        MyInterface3.staticMethod();
    }
}

interface MyInterface3{
    //public  static  final field

    //public abstract method

    //public default method
    //몸통이 있는 인스턴스 메소드

    //public static method
    // : 몸통(body, code block)이 있는 static(class) 메소드

    public static void staticMethod(){
        System.out.println("MyInterface3.method");
    }
}
