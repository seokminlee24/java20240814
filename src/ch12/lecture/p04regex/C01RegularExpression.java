package ch12.lecture.p04regex;

import static java.util.regex.Pattern.matches;

public class C01RegularExpression {
    public static void main(String[] args) {
        // regular expression (정규표현식)
        // 문자열의 패턴을 나타는 코드

        // 관련 클래스 : java.util.regex.Pattern
        // matches : 패턴과 일치하는 지 확인하는 메소드

        // 문자 하나

        String p1 = "a";
        String s1 = "a";
        System.out.println(matches(p1,s1));//t
        System.out.println(matches(p1,"aa"));//f
        System.out.println(matches("aa","aa"));//t
        System.out.println(matches("bb","aa"));//f
        System.out.println();

        //문자 묶음
        String p2 = "[abc]";
        System.out.println(matches(p2,"a")); //t
        System.out.println(matches(p2,"b")); //t
        System.out.println(matches(p2,"c")); //t
        System.out.println(matches(p2,"abc")); //f
        System.out.println();

        String p3 = "[abc][abc][abc]";
        System.out.println(matches(p3,"abc")); //t
        System.out.println(matches(p3,"bbb")); //t
        System.out.println(matches(p3,"bca")); //t
        System.out.println(matches(p3,"a")); //f
        System.out.println(matches(p3,"ab")); //f
        System.out.println(matches(p3,"")); //f
        System.out.println();

        String p4 = "[a-z][a-z]";
        System.out.println(matches(p4,"ad"));//t
        System.out.println(matches(p4,"ko"));//t
        System.out.println();

        String p5 = "[a-z]";
        System.out.println(matches(p5, "a")); //t
        System.out.println(matches(p5, "k")); //t
        System.out.println();

        String p6 = "[a-z][0-9][0-9]";
        System.out.println(matches(p6, "a01"));//t
        System.out.println(matches(p6, "z98"));//t
        System.out.println();

        String p7 = "[a-z0-9][0-9][0-9]";
        System.out.println(matches(p7,"007"));//t
        System.out.println(matches(p7,"a89")); //t
        System.out.println(matches(p7,"zz9")); //f
        System.out.println();

        String p8 ="[^0-9][0-9]";
        System.out.println(matches(p8,"99")); //f
        System.out.println(matches(p8,"a8")); //f
        System.out.println(matches(p8,"*9")); //t

    }
}
