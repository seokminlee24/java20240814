package ch06.lectrue.p05static;

public class C02Static {
    public static void main(String[] args) {
        MyClass02.age = 60;
        MyClass02.name = "son";

        System.out.println(MyClass02.age);
        System.out.println(MyClass02.name);

    }
}
class MyClass02{
    static int age;
    static String name;
}