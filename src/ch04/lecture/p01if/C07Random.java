package ch04.lecture.p01if;

import java.util.Random;

public class C07Random {
    public static void main(String[] args) {
        //1,2,3,4,5,6중 하나의 수 출력
        int i = ((int)(Math.random()*6) + 1);
        System.out.println("i = " + i);
        
        //Random 클래스 사용
        Random random = new Random();
        int j = random.nextInt(6)+1;
        System.out.println("j = " + j);
    }
}
