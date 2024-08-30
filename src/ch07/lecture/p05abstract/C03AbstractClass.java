package ch07.lecture.p05abstract;

import java.math.BigDecimal;

public class C03AbstractClass {
    public static void main(String[] args) {
        //Number n = Number(); //x
        Number n = new Integer(3);
        Number d = new Double(3.14);
        Number a = new BigDecimal("3.141592");
        System.out.println(n);
        System.out.println(d);
        System.out.println(a);

        double v = n.doubleValue();
        double v1 = d.doubleValue();
        double v2 = a.doubleValue();

        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
    }
}
