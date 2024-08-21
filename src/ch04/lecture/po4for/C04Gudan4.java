package ch04.lecture.po4for;

public class C04Gudan4 {
    public static void main(String[] args) {
        // 홀수단만 출력
        // 3, 5, 7, 9 단 만
            for (int j = 3; j <=9 ; j+=2) {
                System.out.println(STR."\{j}단");
                for (int i = 1; i <=9 ; i++) {
                    System.out.println(STR."\{j} X \{i} = \{j * i}");
                }

            }
        }
    }

