package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램 종료 하려면 q를 입력하세여");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do{
            inputString = sc.nextLine();
            System.out.println(inputString);
        }while (!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
