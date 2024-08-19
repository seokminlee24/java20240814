package ch02.lectule.p06scanner;

import java.util.Scanner;

public class C06Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 한 줄에 뜨워서 입력>");
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();

        int v1 = Integer.parseInt(n1);
        int v2 = Integer.parseInt(n2);

        System.out.println("더한값 :" + (v1 + v2));
    }
}
