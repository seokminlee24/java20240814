package ch05.lecture.p04string;

public class C05Length {
    public static void main(String[] args) {
        //length : 문자열의 길이
        String a = "";
        String b = " ";
        String c = "a";
        String d = "abc";
        String e = " ab ";
        String f = "a b c";


        System.out.println(a.length());//0
        System.out.println(b.length());//1
        System.out.println(c.length());//1
        System.out.println(d.length());//3
        System.out.println(e.length());//4
        System.out.println(f.length());//5
    }
}
