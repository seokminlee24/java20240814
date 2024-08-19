package ch02.lectule.p06scanner;

import java.util.Scanner;

public class C07Scnner {
    public static void main(String[] args) {
        // 두 실수를 뒤어 입력 받은 후 더한 값 출력
        //nextDouble
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수 띄어서 입력>");

        String n1 =scanner.next();
        String n2 =scanner.next();

        double v1 = Double.parseDouble(n1);
        double v2 = Double.parseDouble(n2);

        System.out.println("nextDouble :" + (v1 + v2));

    }
}
