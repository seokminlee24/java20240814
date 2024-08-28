package ch06.lectrue.p04costructor;

public class C05This {
    public static void main(String[] args) {
        MyClass05 o = new MyClass05();
        MyClass05 p = new MyClass05();

        p.name = "lee";
        o.name = "son";

        o.printName();
        p.printName();

        o.score = 10;
        p.score = 20;

        o.printFullDescription();
        p.printFullDescription();
    }
}
class MyClass05{
    int score;
    String name;

    void printName(){
        System.out.println(this.name);
    }

    void printFullDescription(){
        this.printName();
        System.out.println(this.score);
    }
}
