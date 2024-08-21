package ch04.lecture.po4for;

public class C03Gudan {
    public static void main(String[] args) {
        for (int j = 2; j <9 ; j++) {
            System.out.println(STR."\{j}단");
            for (int i = 1; i <9 ; i++) {
                System.out.println(STR."\{j} X \{i} = \{j * i}");
            }

        }
    }
}
