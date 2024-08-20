package ch03.lecture.p01arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        //연산결과의 타입은 피연산자 중 큰 타입으로 결정
        int a = 3;
        long b = 5L;

        //int c = a + b; //x
        long d = a + b; //8

        long e = 7;
        double f = 3.14;

        //long 타입 x
        double h = e + f; //10.14

        //나누기(/): 정수 끼리의 연산 결과는 정수
        System.out.println(10 / 3); //3
        //나누기(/): 실수 끼리의 연산 결과는 실수
        System.out.println(10.0 / 3.0); //3.33
        //나누기(/): 실수와 정수의 연산 결과는 실수
        System.out.println(10 / 3.0); //3.33
    }
}
