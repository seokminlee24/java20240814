package ch03.lecture.p05priority;

public class C01Poiorty {
    public static void main(String[] args) {
        //연산자 우선 순위
        //책 107쪽

        //boolean a = false || true &&
        int a = 3 + 5 * 2; //13
        System.out.println("a = " + a);

        // ()러 만자 연산되는 부분을 감싸기
        int b = 3 + (5 * 2); //13
        System.out.println("b = " + b);

        int c = (3 + 5) * 2; //13
        System.out.println("c = " + c);

        int x = 10;
        int y = 5;

        System.out.println(x % 3 == 2 || y % 2 != 1);
        System.out.println(x % 3 == 2 || y % 2 != 1);
        System.out.println((x % 3 == 2) || (y % 2 != 1));

    }
}
