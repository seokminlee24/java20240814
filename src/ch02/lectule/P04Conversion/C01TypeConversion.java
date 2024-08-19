package ch02.lectule.P04Conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        //자동 : 작은공간의 값 -> 큰공간
        //강제 : 큰공간의 값 -> 작은공간
        
        //자동
        //정수형 사이
        int a = 30000;
        long b = a; //자동 형변환
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //강제: 매우매우 주의 해서 사용
        short c = (short) a; //자동 변현 x 강제형변환 ok
        System.out.println("c = " + c);
        int d = 21_0000_0000;
        short e  = (short) d; //강제형변환, 값을 읽은다.
        System.out.println("e = " + e);
    }
}
