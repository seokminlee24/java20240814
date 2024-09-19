package ch14.lectrue.p2status;

public class C02Thread2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드##############");
            }
        });
        t1.start();

        t1.join(); // 이 쓰레드가 끝나기를 기다림
        for (int i = 0; i < 10; i++) {
            System.out.println("메인쓰레드@@@@@@@@@@@@@@@");
        }
    }
}
