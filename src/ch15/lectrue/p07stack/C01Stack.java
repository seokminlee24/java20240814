package ch15.lectrue.p07stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        //Stack(LIFO,Last In First Out)

        Stack<String> stack = new Stack<>();

        //원소추가
        stack.push("java");
        stack.push("css");
        stack.push("react");
        stack.push("vue");
        stack.push("sql");
        stack.push("css");

        //pop : 원소 꺼내기
        System.out.println("pop 사용");
        String item1 = stack.pop();
        System.out.println("item1 = " + item1);
        String item2 = stack.pop();
        System.out.println("item1 = " + item2);
        System.out.println();

        //확인하기
        //size : 원소수
        System.out.println("size 사용");
        int size = stack.size();
        System.out.println("size = " + size);
        System.out.println();

        //peek : 마지막 원소 확인
        System.out.println("peek 사용");
        String item3 = stack.peek();
        System.out.println("item3 = " + item3);
    }

}
