package ch02.lectule.p01variable;

public class C01Variable {
    public static void main(String[] args){
        /*System.out.println("Hello");*/ //여러줄 주석
        // System.out.println("java"); 한줄 주석

        //변수 : 값을 저자장하는 이름이 있는 공간

        //타입변수명
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        // 타입에 맞는 값만 넣을 수 있음
        // a = 3.14

//        정수를 저장할 수 있는  b라는 저장 공간 생성
//        int b;

        //초기화 되지 않은 변수를 사용 할수없음
//        System.out.println(b);
        int b = 3;
        System.out.println(b);


        int c; //# 정수를 담을 수 있는 c 변수 선언하고
        c =100; //c에 100 넣고
        System.out.println(c); //출력하기


    }
}
