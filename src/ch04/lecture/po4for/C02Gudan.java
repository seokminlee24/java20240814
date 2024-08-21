package ch04.lecture.po4for;

import java.util.Scanner;

public class C02Gudan {
    public static void main(String[] args) {
//        for (int i = 1; i <= 2; i++) {
//            for (int j = 1; j <= 10 ; j++) {
//                System.out.println(i + " x " + j + "= " + i*j);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단(2~9)>");
        int dan = scanner.nextInt();

//       if (2 <= dan && dan <= 9) {
//            for (int i = 1; i <= 9; i++) {
//                System.out.println(STR."\{dan} X \{i} = \{dan * i}");
//            }
//        } else {
//            System.out.println("잘 못 입력하였습니다.");
        //}
        if (2 <= dan && dan <= 9) {
            int i = 1;
            while (i <= 9){
                System.out.println(STR."\{dan} X \{i} = \{dan * i}");
                i++;
            }
        }else {
            System.out.println("잘못 입력");
        }
    }
}
