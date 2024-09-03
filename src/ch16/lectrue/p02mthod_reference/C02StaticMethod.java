package ch16.lectrue.p02mthod_reference;

public class C02StaticMethod {
    public static void main(String[] args) {
        //static 메소드
        //타입명::메소드명
        MyInterface21 a = x -> Math.round(x);
        MyInterface21 b = Math::round;

        MyInterface22 c = (x, y) -> Math.max(x, y);
        MyInterface22 d = Math::max;
    }
}

interface MyInterface22 {
    int action(int a, int b);
}

interface MyInterface21 {
    long someAction(double x);
}