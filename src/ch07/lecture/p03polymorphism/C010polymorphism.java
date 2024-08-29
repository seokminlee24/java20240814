package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C010polymorphism {
    public static void main(String[] args) {
        Object o =method();
        String s = o.toString();
        System.out.println("s = " + s);
    }

    public static Object method(){
        double r = Math.random();

        if (r < 0.5){
            System.out.println("java");
        }
        return new Scanner(System.in);
    }
}
