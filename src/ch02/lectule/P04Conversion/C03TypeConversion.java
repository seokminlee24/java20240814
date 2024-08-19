package ch02.lectule.P04Conversion;

public class C03TypeConversion {
    public static void main(String[] args) {
        //정수(byte,short,int,long) <---> 실수(float,double)
        //정수(int,long)<-------->실수(double)
        //정수에서 실수는 자동형변환
        //실수에서 정수는 강제형변환
        //char은 int나 long만 자동형 가능
        long a = 50000;
        double b = a; //자동형 ok

        double c = 50000;
        double d = (long) c; //강제형

        //소수점 이하의 값을 버릴떄 주 사용
        double e= 3.14;
        double f= (long)3.14;

        System.out.println("b = " + b);
        System.out.println("d = " + d);
        System.out.println("f = " + f);

    }
}
