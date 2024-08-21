package ch04.lecture.po4for;

public class C04Gudan5 {
    public static void main(String[] args) {
        // 9~2단 순으로 출력
        // 9 X 1 = 9
        // 9 X 2 = 18
        // 9 X 3 = 27
        // ..
        // 9 X 9 = 81
        // 8 X 1 = 8
        // ...
        // 2 X 9 = 18
        for (int j = 9; j >=2 ; j--) {
            System.out.println(STR."\{j}단");
            for (int i = 1; i <9 ; i++) {
                System.out.println(STR."\{j} X \{i} = \{j * i}");
            }

        }
    }
}
