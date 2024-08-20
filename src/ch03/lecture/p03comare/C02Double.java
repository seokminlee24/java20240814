package ch03.lecture.p03comare;

public class C02Double {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        double d = a + b;

        System.out.println(c == d);//false, 근사값지정(true)

        long e = (long) (c * 10000);
        long f = (long) (d * 10000);
        System.out.println(e == f);//true

    }
}
