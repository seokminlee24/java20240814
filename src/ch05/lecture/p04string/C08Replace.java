package ch05.lecture.p04string;

public class C08Replace {
    public static void main(String[] args) {
        //replace : 부분 문자열을 다른 문자열로 교체
        String s = "java programming language, python language";
        //원본은 바뀌지 않는다.
        String t = s.replace("language", "언어");

        System.out.println(s);
        System.out.println(t);

    }
}