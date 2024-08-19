package ch02.lectule.p03string;

public class C06T0String {
    public static void main(String[] args) {
        //기본타입을 String으로 변환하기
        //String.valueOf
        //""(빈문자열)과(연결연산)
        int a = 33;
        String b = String.valueOf(a); //"33"
        String c = "" + a; // "33"
        String d = a + ""; // "33"

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
