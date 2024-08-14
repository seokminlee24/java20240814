package ch02.lectrue.p02type;

public class C0Type {
    public static void main(String[] args){
        //자바 데이타 타입 2가지
        //1.primitive type 8가지
        //byte : 1바이트 정수형
        //short :2바이트 정수형
        //int : 4바이트 정수형
        //long : 8바이트 정수형
        //float : 4 바이트 실수형
        //double : 8 바이트 실수형
        //boolean 1바이트 논리형
        // char : 2바이트 문자형


        //////////////
        //primitive type
        //정수형 ( byte : 1바이트, short :2바이트, int : 4바이트, long : 8바이트 )

        //byte (1바이트)
        byte b1;
        b1 =127;
        byte b2;
        b2 = -128;
        //byte b3 = 128; x
        //byte b4 = -129; x

        //int (4바이트)
        int v1 =2147483647;
        System.out.println("v1 = " + v1);

        System.out.println( v1 + 1);

        //long (8byte)
        //4byte 이상의 수 적성 시 끝에 L 붙이기
        long v2 =21474836480000L;
        long v3 =21_4748_3648_0000L;
        long v4 =21_474_836_480_000L;

        //실수형( float : 4 바이트 실수, double : 8 바이트 )
        //논리형 (boolean 1바이트)
        //문자형(char : 2바이트)
    }
}
