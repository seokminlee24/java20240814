package ch04.sol;

import java.util.Scanner;

public class S07Of1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run= true;
        int balance = 0;

        while (run){
            System.out.println("----------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료" );
            System.out.println("----------");
            System.out.print("선택>");
            int strNum = sc.nextInt();
            int money = 0;

            switch (strNum){
                case 1 ->{
                    System.out.println("예금액>");
                    money = sc.nextInt();
                    balance += money;
                }
                case 2 ->{
                    System.out.println("축금액>");
                    money = sc.nextInt();
                    balance -= money;
                }
                case 3 ->{
                    System.out.println(balance);
                }
                case 4 ->{
                    run = false;
                }
            }

        }
        System.out.println("프로그램 종료");
    }
}
