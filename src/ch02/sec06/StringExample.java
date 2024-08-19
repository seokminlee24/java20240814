package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // String 타입 변수 선언
        String name = "홍길동";
        String job = "프로그래머";
        // 출력  name과 job
        System.out.println("name = " + name); // 홍길동
        System.out.println("job = " + job); // 프로그래머

        // 출력시 ""표현,  \"
        String str = "나는 \"자바\"를 배웁니다";
        System.out.print("str = " + str); //나는 "자바"를 배웁니다

        // 출력시 \t는 탭만큼 뛰움
        str = "번호\t이름\t자바";
        System.out.print("str = " + str);//번호	이름	자바

        // \n 출력시 줄바꿈
        System.out.print("나는\n");//나는 \n
        System.out.print("자바를\n");//자바를 \n
        System.out.print("배웁니다.");

    }
}
