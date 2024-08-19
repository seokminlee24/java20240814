package ch02.lectule.P04Conversion;

public class C07TypeConversion {
    public static void main(String[] args) {
        //강제형변환(casting)은 기본타입간, 또는 참조 타입간에만 가능
        long a = 3;
        int b = (int) a;

        //
//        String c = (String) a;
        String  d = "3";
       // int e = (int) d; //기본 타입과 참조 타입간의 형변환x
    }
}
