package ch04.sec05;

public class FloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f ; x+=0.1f) { //정수형만 써라
            System.out.println("x = " + x);
        }

//        float x = 0.1f;
//        while (x <= 1.0f){
//            x+=0.1f;
//            System.out.println("x = " + x);
//        }
    }
}
