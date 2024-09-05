package ch12.sec07;

import static java.lang.Math.*;

public class MathExample {
    public static void main(String[] args) {
        double v1 = ceil(5.3);
        double v2 = floor(5.3);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println();

        long v3 = max(3, 7);
        long v4 = min(3, 7);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);
        System.out.println();

        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = round(temp1);
        System.out.println("temp2 = " + temp2);
    }
}
