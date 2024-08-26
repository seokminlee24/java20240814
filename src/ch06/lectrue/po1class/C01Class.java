package ch06.lectrue.po1class;

public class C01Class {
    public static void main(String[] args) {
        String a = new String("java");

        MyClass01 b = new MyClass01();
        MyClass01 c = new MyClass01();

        int codA = System.identityHashCode(a);
        System.out.println("codA = " + codA);

        int codB = System.identityHashCode(b);
        System.out.println("codB = " + codB);

        int codC = System.identityHashCode(c);
        System.out.println("codC = " + codC);
    }
}
//class(설계도 만들기)
class MyClass01 {

}

