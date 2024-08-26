package ch05.lecture.p02reference;

public class C05Parameter {
    public static void main(String[] args) {
        int b = 5;
        
        method1(b);
    }

    public static void method1(int a) {
        System.out.println(a);
        System.out.println("a = " + a);
        a=6;
        System.out.println("a1 = " + a);
    }
}
