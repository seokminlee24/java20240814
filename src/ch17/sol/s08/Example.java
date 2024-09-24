package ch17.sol.s08;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동" , "개발자"),
                new Member("김나리" , "디자이너"),
                new Member("신용권" , "개발자")
        );
        Map<String,List<Member>> map1 = new HashMap<>();
        for (Member m : list){
            String job = m.getJob();
            if (map1.containsKey(job)){
                List<Member>members = map1.get(job);
                members.add(m);
            }else {
                List<Member> members = new ArrayList<>();
                map1.put(job,members);
                members.add(m);
            }
        }
        System.out.println(map1);

        Map<String,List<Member>> groupingMap = list.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getJob()
                        )
                );

        System.out.println("[개발자]");
        List<Member> developerList = groupingMap.get("개발자");
        developerList.forEach(s -> System.out.println(s));
        System.out.println();
        System.out.println("[디자이너]");
        List<Member> designerList = groupingMap.get("디자이너");
        designerList.forEach(s -> System.out.println(s));
    }
}
