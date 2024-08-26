package ch05.lecture.p04string;

public class C011Contains {
    public static void main(String[] args) {
        //특정 문자열 이 있으면 true
        String s = "java programming language";

        boolean a = s.contains("java"); //true
        System.out.println(a);

        boolean b = s.contains("pro"); //true
        System.out.println("b = " + b);

        boolean c = s.contains("a"); //true
        System.out.println("c = " + c);

        boolean d = s.contains("python"); //f
        System.out.println("d = " + d);
    }
}
