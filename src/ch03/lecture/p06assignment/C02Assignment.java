package ch03.lecture.p06assignment;

public class C02Assignment {
    public static void main(String[] args) {
        // = : 오른쪽 값 왼쪽 변수에 대입
        // += : (왼쪽 값과 오른쪽 값을 더해서) 왼쪽 변수에 대입
        // -= : (왼쪽 값과 오른쪽 값을 뺴서) 왼쪽 변수에 대입
        //*= : (왼쪽 값과 오른쪽 값을 곱해서) 왼쪽 변수에 대입
        // /= : (왼쪽 값과 오른쪽 값을 나눠서) 왼쪽 변수에 대입
        // %= : (왼쪽 값과 오른쪽 값을 나눠서 나머지를 ) 왼쪽 변수에 대입

        int a = 10;
        int b = 3;
        a += b; // a = a + b
        System.out.println("a = " + a); //13

        int c = 10;
        int d = 3;
        c -= d; //c = c-d
        System.out.println("c = " + c); //7

        int e = 10;
        int f = 3;
        e *= f;
        System.out.println("e = " + e); //30

        int g = 10;
        int h = 3;
        g /= h;
        System.out.println("g = " + g); //3

        int j = 10;
        int k = 3;
        j %= k;
        System.out.println("j = " + j); //1

    }
}
