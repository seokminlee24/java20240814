package ch06.lectrue.p06final;

public class C01Final {
        //final : 변수의 값을 바꾸지못하게 하는 키워드
        //->변수에 값을 한번만 할당할 수있음
    public static void main(String[] args) {
        int a =3;
        System.out.println(a);
        a = 4; // 변경가능
        System.out.println(a);

        final int b;
        b = 30;
        System.out.println(b);
        //b = 40;//변경불가
        System.out.println(b);
        final int c = 40; //값 더이상 변경불가
        System.out.println(c);
    }
}
