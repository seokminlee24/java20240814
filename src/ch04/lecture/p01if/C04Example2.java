package ch04.lecture.p01if;

import java.util.Scanner;

public class C04Example2 {
    public static void main(String[] args) {
        //20세 이상 성인
        //13 ~19면 청소년
//        6~12세는 어린이
        //1~5세는 유아
        // 나이를 잘못을 입력하셨습니다
        Scanner scanner =new Scanner(System.in);
        System.out.print("나이>");
        int age = scanner.nextInt();

        if (age >= 20) {// 20 =< age 읽기 쉬움
            System.out.println("나이는 20세 이상입니다.");
            System.out.println("성인");
        } else if (13 <= age && age <= 19) { //age <= 19만 해도 됨
            System.out.println("나이는 13~ 19세입니다.");
            System.out.println("청소년");
        } else if (6 <= age && age <= 12) {
            System.out.println("나이는 6~ 12세입니다.");
            System.out.println("어린이");
        } else if (1 <= age && age <= 5) {
            System.out.println("나이는 1~ 5세입니다.");
            System.out.println("어린이");
        }else {
            System.out.println("나이를 잘못 입력 하셨습니다.");
        }
    }
}
