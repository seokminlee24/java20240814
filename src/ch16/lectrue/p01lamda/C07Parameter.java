package ch16.lectrue.p01lamda;

public class C07Parameter {
    public static void main(String[] args) {
        MyInterface7 o = () -> System.out.println("코드");
        o.some();
    }
}

@FunctionalInterface
interface MyInterface7 {
    void some();
}