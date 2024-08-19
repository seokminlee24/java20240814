package ch02.lectule.P04Conversion;

public class C05TypeConversion {
    public static void main(String[] args) {
//        연산시 큰 타입으로 자종변환
        int a = 3;
        int b = 5;
        int c = a + b; //ok

        int d = 3;
        long e = 5;
        long f = d + e; //long타입

        int g = 3;
        long h = 40_0000_0000L;
        long i = g + h;
        System.out.println("i = " + i);

        //
        int j = 9;
        double k = 3.14;
        double l = j+ k; //double
        System.out.println("l = " + l);
    }
}
