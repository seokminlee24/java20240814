package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x; //부호 변경
        System.out.println("x = " + x); //x = 100

        byte b = 100;
        int y = -b; //부호변경
        System.out.println("y = " + y); //y = -100
    }
}
