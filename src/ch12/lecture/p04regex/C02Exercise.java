package ch12.lecture.p04regex;

import java.util.Scanner;

import java.util.regex.Pattern;

public class C02Exercise {
    public static void main(String[] args) {
        //사용자 입력을 빋아서
        //6개의 숫자로 이루어진 문자열인지 확인하는 코드
        Scanner sc = new Scanner(System.in);
        String p = "[1-9][1-9][1-9][1-9][1-9][1-9]";
        while (true){
            System.out.print("6개의 숫자 입력>");
            String inPut = sc.nextLine();
            if (inPut.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            if (Pattern.matches(p,inPut)){
                System.out.println("일치");
            }else{
                System.out.println("불일치");
            }
        }
    }

}
