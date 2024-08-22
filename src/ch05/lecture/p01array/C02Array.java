package ch05.lecture.p01array;

public class C02Array {
    public static void main(String[] args) {
        int[] a; // 배열타입 a 선언
        a = new int[3]; // 3개의 값을 저장 가능한 공간 생성
        a[0] = 33;
        a[1] = 44;
        a[2] = 55;
         //a[3] = 66//Exception
        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[2] = " + a[2]);
    }
}
