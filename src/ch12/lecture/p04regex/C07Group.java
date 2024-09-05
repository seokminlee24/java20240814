package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C07Group {
    public static void main(String[] args) {
        String p1 = "x+"; // + : {1,}
        System.out.println(matches(p1,"x")); //t
        System.out.println(matches(p1,"xx")); //t
        System.out.println(matches(p1,"xxx")); //t
        System.out.println();

        String p2 = "(abc)+";
        System.out.println(matches(p2,"abc")); //t
        System.out.println(matches(p2,"abcabc"));
        System.out.println();

        String p3 = "(011)*";
        System.out.println(matches(p3,""));//t
        System.out.println(matches(p3,"011"));
        System.out.println(matches(p3,"011011"));
    }
}
