package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                     map.put(i,"내용"+i);
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i,"내용"+i);
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
        System.out.println("총 객체 수 = " + size);
        System.out.println();
    }
}
