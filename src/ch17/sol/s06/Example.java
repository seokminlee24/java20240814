package ch17.sol.s06;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double average = list.stream()
                .map(Member::getAge)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("평균 나이 : " + average);

        double avg1 = 0.0;
        for(Member member : list){
            avg1 += member.getAge();
        }
        avg1 /= list.size();
        System.out.println("avg1 = " + avg1);
    }
}
