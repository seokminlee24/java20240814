package ch04.sol;

import java.util.Scanner;

public class S07 {
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

            if (strNum==(1)) {
                System.out.print("예금액>");
                balance += sc.nextInt();

            } else if (strNum==(2)) {
                System.out.print("출금액>");
                balance -= sc.nextInt();
            } else if (strNum==(3)) {
                System.out.println("잔고>" + balance);

            }else if (strNum==(4)) {
                run = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
