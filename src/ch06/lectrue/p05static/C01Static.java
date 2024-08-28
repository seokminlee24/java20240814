package ch06.lectrue.p05static;

public class C01Static {
    public static void main(String[] args) {
        System.out.println(MyClass01.number);
    }
}
class MyClass01{
    int age; //intstance field

    //static field(class field, 정적 필드)
    static int number;
}

