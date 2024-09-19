package ch15.sec4.exam02;

import java.util.HashMap;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(String.valueOf(i),i);
                }
            }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int size = map.size();
        System.out.println("총 엔트리 수 = " + size);
        System.out.println();
    }
}
