package ch03.sec07;

import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자입력>");
        char inputchar = scanner.next().charAt(0);
        int charCode = (int) inputchar;
        //int charCode = scanner.next().charAt(0);
        //int charCode = 'A';//65
        //int charCode = 'a';/97
        //int charCode = '5';//5

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자 이군요."); //A

        }
        if ((97 <= charCode) & (charCode <= 122)) {
            System.out.println("소문자."); //a

        }
        if ((48 <= charCode) & (charCode <= 57)) {
            System.out.println("0~9"); //5

        }
        //--------------------------------------
        System.out.print("수>");
        int value = scanner.nextInt();

        //int value = 7;
        //int value = 6;
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수로군요"); //6
        }
        boolean result = ((value % 2 == 0) || (value % 3 == 0));
        if (!result) {
            System.out.println("2 또는 3의 배수가 아닌 군요");//7

        }
    }
}
