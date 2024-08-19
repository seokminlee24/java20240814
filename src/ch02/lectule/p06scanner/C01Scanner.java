package ch02.lectule.p06scanner;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        // Sanner : 소스를  훑으며 입력받음
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력> :");
       String str = scanner.nextLine();//한줄 입력

        System.out.println("입력> " + str);
    }
}
