package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동",45));
        treeSet.add(new Person("감자바",25));
        treeSet.add(new Person("박지원",31));

        treeSet.forEach(System.out::println);

        for (Person person:treeSet){
            //System.out.println(person.toString());
            System.out.println(person.getName() + ":" + person.getAge());
        }
    }
}
