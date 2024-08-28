package ch06.lectrue.p04costructor;

public class C08ThisConstructor {
    public static void main(String[] args) {
    }
}
class MyClass08{
    int age;
    int id;
    String name;
    String address;

    public MyClass08(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public MyClass08(int age, int id, String name, String address) {
        //this()생성자 호출
        /*this.age = age;
        this.id = id;
        this.name = name;*/
        this(age,id,name);
        this.address = address;

    }
}
