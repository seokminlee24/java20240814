package ch02.lectrue.p02type;

import java.math.BigDecimal;

public class C02Double1 {
    public static void main(String[] args){
        double a = 0.1;
        double b = 0.2;
        double c = a + b;

        System.out.println("c = " + c);

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.add(e);
        System.out.println("f= " + f);
    }
}
