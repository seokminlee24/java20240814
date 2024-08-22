package ch04.sol;

public class S06Of1 {
    public static void main(String[] args) {
         /*
        0
        1
        2
        3
        4
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("------------------");

        /*
        4
        3
        2
        1
        0
         */
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("----------------");
        /*
        1
        2
        3
        4
        5
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("--------------");


        /*
        5
        4
        3
        2
        1
         */
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        /*
        0
        01
        012
        0123
        01234
         */
        System.out.println("--------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        1
        12
        123
        1234
        12345
         */
        System.out.println("----------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*

         *****
         ****
         ***
         **
         *

         */
        System.out.println("-----------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        0
        12
        345
        6789
        01234

         */
        System.out.println("--------------");
        int i = 0;

        for (int j = 0; j < 5; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(i % 10);
                i++;
            }
            System.out.println();
        }

    }
}
