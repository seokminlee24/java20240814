package ch13.lectrue.po3polymethod;

import java.util.Scanner;

public class C01BoundedTypeParameter {
    public static void main(String[] args) {
        var o1 = new MYClass1<String>(); 
        var o2 = new MYClass1<Integer>(); 
        var o3 = new MYClass1<Scanner>();
        o1.method("java");
        o2.method(555);
        o3.method(new Scanner(""));
        
    }
}

class MYClass1<T>{
    void method(T param){
        System.out.println(param instanceof Object); //t
        System.out.println("param.toString() = " + param.toString());
        System.out.println("param.equals(null) = " + param.equals(null));
        System.out.println("param.hashCode() = " + param.hashCode());
        
        if(param instanceof String s){
            int length = s.length();
            System.out.println("length = " + length);
        }
        System.out.println();
    }
}
