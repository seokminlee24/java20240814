package ch17.sol.s07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동" , "개발자"),
                new Member("김나리" , "디자이너"),
                new Member("신용권" , "개발자")
        );

        List<Member> developers1 = new ArrayList<>();
        for (Member m : list){
            if (m.getJob().equals("개발자")){
                developers1.add(m);
            }
        }
        developers1.forEach(s -> System.out.println(s.getName()));

        /*List<Member> developers = list.stream()
                .filter(s -> s.getJob().equals("개발자"))
                .collect(Collectors.toList());
        developers
                .stream()
                .forEach(n -> System.out.println(n.getName()));*/
    }
}
