package ch05.lecture.p04string;

public class C09SubString {
    public static void main(String[] args) {
        //subString 부분 문자열 추출
        //원본 문자열 변경 안됨

        String s = "java programming language";
        String s1 = s.substring(5,8);

        System.out.println(s);
        System.out.println(s1);//pro
        System.out.println(s.substring(17,21));//lang

        String s2 = s.substring(17);
        String s3 = s.substring(17,s.length());
        System.out.println(s2);//language
        System.out.println(s3);//language

    }
}
