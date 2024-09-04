package ch09.lectrue.p02nested;

public class C05FinalLocalVariable {
    public static void main(String[] args) {
        MyClass5 o = new MyClass5();
    }
}

class MyClass5{
    void some(){
        //local class에서 사용되는
        //local variable(지역 변수)는 final 이어야함
        //final 키워드 붙이지 않으면
        //effectively final
        final int A = 5;
        class Nested5{
            void action(){
                System.out.println("Nested5.action");
                System.out.println("A = " + A); //a의 값은 변경 불가능
            }
        }
        Nested5 o = new Nested5();
        o.action();
    }
}
