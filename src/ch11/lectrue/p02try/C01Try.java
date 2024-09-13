package ch11.lectrue.p02try;

public class C01Try {
    public static void main(String[] args) {
        try {
            //exception 이 발생할 것 같은 코드들
            int a = 3;
            int b = 0;
            int c = a / b; //ArithmeticException
        } catch (ArithmeticException e) {
            //exception 객체로 어떤 일을 함...

        }

        System.out.println("다음 코드");
    }
}
