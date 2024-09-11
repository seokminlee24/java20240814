package ch15.lectrue.p08queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //offer : 추가
        queue.offer("java");
        queue.offer("css");
        queue.offer("html");
        queue.offer("jsp");
        queue.offer("css");

        //poll : 꺼내기
        String item1 = queue.poll();
        System.out.println("item1 = " + item1);
        String item2 = queue.poll();
        System.out.println("item2 = " + item2);
        System.out.println();

        //확인하기
        //peek: 끝에 있는 원소 확인
        //IsEmpty,size
        String item3 = queue.peek();
        System.out.println("item3 = " + item3);
        int size = queue.size();
        System.out.println("size = " + size);
    }
}
