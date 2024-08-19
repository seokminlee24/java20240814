package ch02.lectule.P04Conversion;

public class C06TypeConversion {
    public static void main(String[] args) {
        //byte,short,int 끼리의 연산의 결과는 int
        byte a = 3;
        byte b = 5;
        byte c = (byte) (a + b);
        System.out.println("c = " + c);
        
        // 정수 끼리의 연산 결과는 정수
        int d = 5;
        int e = 3;
        double f = (double) d / e; // 1.666666(x) ,1(0)
        int g = d / e;
        System.out.println("f = " + f);
        System.out.println("g = " + g);
    }
}
