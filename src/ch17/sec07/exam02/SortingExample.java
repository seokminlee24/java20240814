package ch17.sec07.exam02;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );

        list.stream()
                .sorted((s, t) -> Integer.compare(s.getScore(), t.getScore()))
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .sorted(comparingInt(Student::getScore))
                .forEach(System.out::println);
        System.out.println();

        // 점수 내림차순
        System.out.println();
        list.stream()
                .sorted((s, t) -> Integer.compare(t.getScore(), s.getScore()))
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .sorted(comparingInt(Student::getScore).reversed())
                .forEach(System.out::println);

    }
}
