package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C06Exercise {
    public static void main(String[] args) {
        //사용자 입력을 받아서
        //전화번호 패턴과 같은 지 학인
        //010 - 9999 - 1111
        //02 - 2345 - 6789
        //031 - 789 - 7890

        Scanner sc = new Scanner(System.in);
        String number = "\\d{2,3}-\\d{3,4}-\\d{4}";

        while (true){
            System.out.print("전화번호 입력>");
            String input = sc.next();
            if (input.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            }
            if (Pattern.matches(number,input)){
                System.out.println("일치");
            }else{
                System.out.println("불일치");
            }
        }
    }
}
