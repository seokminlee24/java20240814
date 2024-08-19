package ch02.lectule.p06scanner;

import java.util.Scanner;

public class C04sanner {
    public static void main(String[] args) {
        //실수 두개 입력 받아서 더한값 출력시키기
        Scanner scanner = new Scanner(System.in);

        System.out.print("수1>");
        String num1 = scanner.nextLine();

        System.out.print("수2>");
        String num2 = scanner.nextLine();

        double n1 = Double.parseDouble(num1);
        float n2 = Float.parseFloat(num2);

        //
        System.out.println("더한 결과: " + (n1 + n2));
    }
}
