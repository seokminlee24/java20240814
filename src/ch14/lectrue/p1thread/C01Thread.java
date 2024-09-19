package ch14.lectrue.p1thread;

import java.awt.*;

public class C01Thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
        toolkit.beep(); //띵

        Thread.sleep(1000); //1000ms(1초) 멈춤

        toolkit.beep();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띠링");
            Thread.sleep(1000); // 1000ms(1초) 멈춤
        }
    }
}
