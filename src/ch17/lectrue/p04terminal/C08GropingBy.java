package ch17.lectrue.p04terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C08GropingBy {
    public static void main(String[] args) {
        //분휴 후 reduce(sum,max,min,count,avg)
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        Map<String,Long> map = list.stream()
                .collect(
                        Collectors.groupingBy(
                                e -> e % 2 == 0 ? "짝" : "홀",
                                Collectors.counting()
                        )
                );
        map.forEach((k,v) -> System.out.println(k + ":" + v + "개"));
    }
}
