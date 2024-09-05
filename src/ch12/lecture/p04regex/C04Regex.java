package ch12.lecture.p04regex;

import static java.util.regex.Pattern.matches;

public class C04Regex {
    public static void main(String[] args) {
        // \\ : \
        String p1 = "\\\\";
        System.out.println(matches(p1,"\\")); //t
        System.out.println();

        //. : 모든 문자
        String p2 = ".";
        System.out.println(matches(p2,"a")); //t
        System.out.println(matches(p2,"가"));
        System.out.println(matches(p2,"0"));
        System.out.println();

        String p3 = "..";
        System.out.println(matches(p3,"a"));//f
        System.out.println(matches(p3,"ad"));//t
        System.out.println();

        //\. : .
        String  p4 = "\\.";
        System.out.println(matches(p4,".")); //t
        System.out.println(matches(p4,"1")); //f
    }
}
