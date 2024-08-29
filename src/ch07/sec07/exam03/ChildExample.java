package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data";
        parent.method1();
        parent.method2();

        /*parent.field2 = "data2"; //불가능
        parent.method3();*/ //불가능

        Child c =(Child) parent;

        Child child = new Child();
        child.field2 = "data"; //가능
        child.method3();//가능
    }
}
