package ch14.lectrue.p1thread;

import java.awt.*;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread t1 = new Thread(){
            public void run() {
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); //띵

                    try {
                        Thread.sleep(1000); //1000ms(1초) 멈춤
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    toolkit.beep();
                }
            }
        };

        Thread t2 = new Thread(){
           public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("띠링");
                    try {
                    Thread.sleep(1000); // 1000ms(1초) 멈춤
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
           }
        };

        t1.start();
        t2.start();
    }
}


