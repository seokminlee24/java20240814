package ch04.sol;

public class S06 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        for (int a = 5; a >= 1; a--) {
            for (int b = 0; b < a ; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

