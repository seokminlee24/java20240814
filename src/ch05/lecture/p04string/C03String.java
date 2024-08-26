package ch05.lecture.p04string;

public class C03String {
    public static void main(String[] args) {
        String a = new String("java");
        String b = "java";
        String c = new String("java");
        String d = "java";

        //문자 비교시 == 사용하지 말것
        System.out.println(a == b); //f
        System.out.println(b == d); //t
        System.out.println(a == c); //f

        //문자 비교시 equals 사용!!
        System.out.println(a.equals(b));//t
        System.out.println(b.equals(d));//t
        System.out.println(a.equals(c));//t
    }
}
