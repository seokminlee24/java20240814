package ch06.lectrue.p04costructor;

import java.util.Arrays;

public class C07Overloding {
    public static void main(String[] args) {
    MyClass07 o = new MyClass07(1,44,"손흥민","서울");
        System.out.println("o.id = " + o.id);
        System.out.println("o.age = " + o.age);
        System.out.println("o.name = " + o.name);
        System.out.println("o.address = " + o.address);
    }
}
class MyClass07{
    int id;
    int age;
    String name;
    String address;

    MyClass07(int id,int age, String name, String address){
        this.id = id;
        this.age = age;
        this.name = name;
        this.address =  address;
    }
    MyClass07(int id,int age){
        this.id = id;
        this.age = age;
    }
    MyClass07(String name, String address){
        this.name = name;
        this.address =  address;
    }
}
