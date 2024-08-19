package ch02.lectule.P04Conversion;

public class C02TypeConversion {
    public static void main(String[] args) {
        //실수 간
        //float(4), double(8)
        float a = 3.14f;
        double b = a; //자동 형변환 ok

        double c = 3.14;
        float d = (float)  c; //자동 x , 강제 ok

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
