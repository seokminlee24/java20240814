package ch04.sec02;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("점수 90점 보다 큽니다.");
            System.out.println("등급은 A등급 입니다.");
        }
        if(score <= 90) {
            System.out.println("점수 90점 보다 작습니다..");
            System.out.println("등급은 B등급 입니다.");
        }
    }
}
