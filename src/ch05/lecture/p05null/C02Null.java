package ch05.lecture.p05null;

public class C02Null {
    public static void main(String[] args) {
        String a = "java";
        String b = null;

        String c = null; // 초기화되지 않은 변수는 사용할 수 없음

        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
