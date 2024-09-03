package ch16.lectrue.p02mthod_reference;

public class C01MethodReference {
    public static void main(String[] args) {
        MyInterface1 o = a -> System.out.println(a);
        o.method(99);

        //MyInterface1 s =

        //다른 메소드 호출을 같은 파라미터 순서로 할떄
        //메소드 참조 사용 가능

        //메소드 참조
        //1.static 메소드
        // 타입명::메소드명
        //2.instance 메소드
        //객체명 :: 메소드명
        //3.특정 타입의 인스턴스 메소드
        //타입명 ::메소드명
        //4.생성자 호출
        //타입명::new
        MyInterface1 p = x -> someAction(x);
        p.method(100);

        MyInterface1 q = C01MethodReference::someAction;
        q.method(100);
    }
    public static void someAction(int param){
        System.out.println(param*2);
    }
}

@FunctionalInterface
interface MyInterface1{
    void method(int a);
}