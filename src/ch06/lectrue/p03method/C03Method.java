package ch06.lectrue.p03method;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.name = "흥민";
        MyClass03 b = new MyClass03();
        b.name = "톰 홀란드";

        a.printName();
        b.printName();


    }
}
class MyClass03{
    //field
    String name;

    public void printName(){
        System.out.println(name + "입니다");
    }
}
