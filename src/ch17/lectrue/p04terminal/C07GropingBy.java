package ch17.lectrue.p04terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C07GropingBy {
    public static void main(String[] args) {
        //groupingBy : 분류
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        Map<String,List<Integer>> map = list.stream()
                .collect(
                        Collectors.groupingBy(e -> e % 2 == 0 ? "짝" : "홀"));
        map.forEach((k,v) -> System.out.println(k + ":" + v));

        map.forEach((k,v) -> {
            long count = v.stream()
                    .count();
            System.out.println(k + ":" + count + "개");
        });
    }
}
