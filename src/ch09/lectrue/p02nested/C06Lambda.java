package ch09.lectrue.p02nested;

public class C06Lambda {
    public static void main(String[] args) {
        int a = 5;
        MyInterface6 o = () -> {
            System.out.println("a = " + a);
            //local class 에서
            //감싸고 있는 메소드의 지역변수(파라미터)의 값을 변경할 수 없음
            //a = 7;
        };
        //effectively final 이어서 변경 불가
        //a = 8;
    }
}

interface MyInterface6{
    void someAction();
}
