package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        // 정수,6자리 정수 왼쪾 공백 ,오른쪾 6자리 정수,공백 0 6자리 정수
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);//123
        System.out.printf("상품의 가격:%6d원\n", value);//___123
        System.out.printf("상품의 가격:%-6d원\n", value);//123___
        System.out.printf("상품의 가격:%06d원\n", value);//000123

        //정수,왠쪽 공백 7자리 정수+소수점 2자리
        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10 ,area);//반지름이 10인 원의 넓이:    314.16,

        //6자리 정수, 왼쪾 공백 10자리 정수 오른쪽 공백,10자리 문자열
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job );//      1 | 홍길동        |         도적
    }
}
