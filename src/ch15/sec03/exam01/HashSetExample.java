package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HeadSet 컬렉션
        Set<String> set = new HashSet<>();

        //Member 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        //저장된 객체 출력
        int size = set.size();
        System.out.print("총 객체 수: " + size);//4
    }
}
