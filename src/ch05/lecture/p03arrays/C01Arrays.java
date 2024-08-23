package ch05.lecture.p03arrays;

public class C01Arrays {
    public static void main(String[] args) {
        package ch05.lecture.p03arrays;

import java.util.Arrays;

        public class C01Arrays {
            public static void main(String[] args) {
                // Arrays : 배열에 관련된 유용한 메소드들이 있는 클래스

                // toString
                int[] a = {5, 6, 7};
                System.out.println(Arrays.toString(a));

                int[][] b = {{4, 5}, {9, 8}};
                System.out.println(Arrays.deepToString(b));

                int[][][] c = {{{6, 1}, {8, 3}}, {{3, 4}, {2, 1}}};
                System.out.println(Arrays.deepToString(c));

                // copyOf
                int[] d = {100, 200};
                int[] e = Arrays.copyOf(d, d.length);
                System.out.println(Arrays.toString(d));
                System.out.println(Arrays.toString(e));
                e[0] = 300;
                System.out.println(Arrays.toString(d));
                System.out.println(Arrays.toString(e));

                int[][] f = {{5, 1}, {4, 0}};
                int[][] g = Arrays.copyOf(f, f.length);
                System.out.println(Arrays.deepToString(f));
                System.out.println(Arrays.deepToString(g));
                g[0][0] = 55;
                System.out.println(Arrays.deepToString(f));
                System.out.println(Arrays.deepToString(g));

            }
        }

    }
}
