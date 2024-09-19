package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> l1 = new ArrayList<>();

        //Vector 컬렉션  생성
        //Collections.synchronizedList
        //List<Board> list = new Vector<>();
        List<Board> list = Collections.synchronizedList(l1);

        Thread threadA = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) { // 1부터 1000까지로 수정
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) { // 1001부터 2000까지로 수정
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        int size = list.size();
        System.out.println("총 객체 수 = " + size);
        System.out.println();
    }
}
