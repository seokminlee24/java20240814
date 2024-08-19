package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환 int <-- byte
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue); // intValue = 10

        //자동 터입 변환 int <---- char
        char charValue = '가';
        intValue = charValue;
        System.out.println("intValue = " + intValue); //intValue = 44032

        //자동 타입 변환 long <--- int
        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);//longValue = 50

        //자동 타입 변환 float <---- long
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue); //floatValue = 100.0

        //자동 타입 변환 double <--- float
        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue); //doubleValue = 100.5
    }
}
