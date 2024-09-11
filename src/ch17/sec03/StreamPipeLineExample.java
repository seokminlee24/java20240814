package ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 1. stream 만들기
        Stream<Student> stream = list.stream();

        // 2. 중간연산
        IntStream stream1 = stream.mapToInt(student -> student.getScore());

        // 3. 최종연산
        OptionalDouble average = stream1.average();

        // ...나머지
        double avg = average.getAsDouble();
        System.out.println("avg = " + avg);


        /// 한 번에 (method chaining)
        double avg1 = list.stream() // 1. 스트림 만들기
                .mapToInt(student -> student.getScore()) // 2. 중간연산
                .average() // 3. 최종연산
                .getAsDouble();// 기타등등...

        System.out.println("avg1 = " + avg1);
    }
}
