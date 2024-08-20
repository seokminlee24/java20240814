package ch03.lecture.p01arithmetic;

public class C04Overflow {
    public static void main(String[] args) {
        //byte: -128 ~ 127
        byte a = 127;
        a = (byte) (a + 1);
        System.out.println("a = " + a); //-128

        //underflow
        byte b = -128;
        b = (byte) (a - 1);
        System.out.println("b = " + b); //127
    }
}
