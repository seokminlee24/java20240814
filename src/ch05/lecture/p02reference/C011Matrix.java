package ch05.lecture.p02reference;

import java.util.Arrays;

public class C011Matrix {
    public static void main(String[] args) {
        int[][] m1 = {
                {30,40},
                {22,11}
        };

        int[][]m2= new int[m1.length][];

        for (int i = 0; i <m1.length ; i++) {
            m2[i]=m1[i];
        }
        m2[0][0] = 90;

        System.out.println("m1[0][0] = " + m1[0][0]);
        System.out.println(Arrays.deepToString(m1));
        System.out.println(Arrays.deepToString(m2));
    }
}
