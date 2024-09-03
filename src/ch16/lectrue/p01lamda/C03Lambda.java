package ch16.lectrue.p01lamda;

public class C03Lambda {
    public static void main(String[] args) {
        //lambda 식 (파라미터 목록) -> {메소드 몸통}
        // : Functional Interface 의 익명클래스 객체
        MyInterface3 o = () ->{
            System.out.println("안녕람다");
        };
        o.some();
    }
}

//추상메소드가 하나인 인터 페이스
interface MyInterface3{
    void some();
}
