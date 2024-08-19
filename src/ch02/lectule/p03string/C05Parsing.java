package ch02.lectule.p03string;

public class C05Parsing {
    public static void main(String[] args) {
        String a = "33";

        //문자열은 int로 변환 (파싱)
        int a1 =Integer.parseInt(a);

        int b= 2* a1; //66
        System.out.println("b = " + b);

        String c = "3.14";

        //문자열을 double로 parsing
        double c1 = Double.parseDouble(c);

        double d = 5 + c1;
    }
}
