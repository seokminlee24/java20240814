package ch16.lectrue.p01lamda;

public class C05Method {
    public static void main(String[] args) {
        //메소드 몽통(코드블럭)내의
        //명령문이 1줄이 아니면
        //{} 붙여야함
        MyInterface5 o = () -> {
            System.out.println("명령문1");
            System.out.println("명령문2");
        };
        o.some();

        //명령문이 한줄이면 {} 중괄호 생략
        MyInterface5 p = () -> {
            System.out.println("한줄");
        };
        p.some();

        MyInterface5 q = () -> System.out.println("one line");
        q.some();
    }
}

interface MyInterface5{
    void some();
}
