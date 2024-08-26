package ch05.lecture.p04string;

public class C13Sprit {
    public static void main(String[] args) {
        //문자열을 나누는 메소드
        String s = "java, css,spring,react";
        String[] t= s.split(",");
        System.out.println("t[0] = " + t[0]);
        System.out.println("t[1] = " + t[1]);
        System.out.println("t[2] = " + t[2]);
        System.out.println("t[3] = " + t[3]);

        String u = "java css html";
        String[] v= u.split(",");
        System.out.println("v[0] = " + v[0]);
        System.out.println("v[1] = " + v[2]);
        System.out.println("v[2] = " + v[4]);
    }
}
