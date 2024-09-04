package ch12.sol12.S05;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Student student1 = new Student("1");
        Student student2 = new Student("1");

        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(new Student("2"));

        System.out.println(hashSet.size());
    }
}
