package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x의 값: ");
//        String strX = scanner.nextLine();
//        int x = Integer.parseInt(strX);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("y의 값: ");
//        String strY = scanner.nextLine();
//        int y = Integer.parseInt(strY);
        int y = scanner.nextInt();
        scanner.nextLine();

        int z = x + y;
        System.out.println("두 수의 합 = " + z);

        while (true){
            System.out.print("q 입력시 중단 : ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열 = " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
