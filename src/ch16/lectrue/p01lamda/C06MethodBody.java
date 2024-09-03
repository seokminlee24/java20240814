package ch16.lectrue.p01lamda;

public class C06MethodBody {
    public static void main(String[] args) {
        MyInterface6 o = () -> {
            return 9;
        };
        int a = o.method();
        System.out.println(a);

        //한 줄의 명령문이 리턴문이면
        //중괄호 생략 시 return 키워드도 생략
        MyInterface6 p = () -> 10;
        int b = p.method();
        System.out.println("b = " + b);
    }
}

interface MyInterface6{
    int method();
}
