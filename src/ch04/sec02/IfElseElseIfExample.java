package ch04.sec02;

import java.util.Scanner;

public class IfElseElseIfExample {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("점수>");
        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("점수가 100~90입니다");
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80~89입니다");
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70~79입니다");
            System.out.println("등급은 C 입니다.");
        }else {
            System.out.println("점수가 70점 이하입니다");
            System.out.println("등급은 D 입니다.");
        }
    }
}
