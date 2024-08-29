package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C06polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object o = sc;
        String v = o.toString();
        int i = o.hashCode();
        //nextLine() 안됨
    }
}
