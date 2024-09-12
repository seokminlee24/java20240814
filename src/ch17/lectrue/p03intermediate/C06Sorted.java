package ch17.lectrue.p03intermediate;

import java.util.Comparator;
import java.util.List;

public class C06Sorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(6,1,9,0,10,1,3,7);

        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("-Comparator-");
        list.stream()
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("-Comparator.reverseOrder-");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
