package ch14.lectrue.p3synchronized;

public class C01Thread {
    private static int vlaue = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                vlaue++;
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                vlaue++;
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("vlaue = " + vlaue);

        //여러 쓰레드가
        //같은 객체의 상태를 바꿀 떄 매우 주의해야함!!
        //-> 하지마라!
    }
}
