package ch02.lectule.p06scanner;

import java.util.Scanner;

public class C02scanner {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("이름>");
        String name = scanner.nextLine();

        System.out.println("나이>");
        String age = scanner.nextLine();

        String desc = STR."\{name}님의 나이는 \{age}입니다.";
        System.out.println(desc);
    }
}
