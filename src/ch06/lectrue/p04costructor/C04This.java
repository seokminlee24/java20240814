package ch06.lectrue.p04costructor;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(33,"lee");
        System.out.println(o.age);
        System.out.println(o.name);
    }
}
class MyClass04{
    int age;
    String name;

    //this : 이 클래스로 만들어진 객체의 참조값
    MyClass04(int age, String name){
        this.age = age;
        this.name = name;
    }
}
