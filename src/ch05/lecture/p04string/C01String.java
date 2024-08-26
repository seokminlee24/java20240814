package ch05.lecture.p04string;

public class C01String {
    public static void main(String[] args) {
        String a = new String("java"); //8765
        String b = new String("java"); //8875
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = 5;
        int d = 5;
        System.out.println(c==d);//f
        System.out.println(a==b);//쓰지말아라  쓸꺼면 이퀄스 써라 /t
    }
}
