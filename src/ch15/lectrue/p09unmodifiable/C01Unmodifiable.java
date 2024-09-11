package ch15.lectrue.p09unmodifiable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01Unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list);

        //list.add("hwang");

        Set<String> set1 = Set.of("a","b","c");
        System.out.println(set1);

        //Set1.add("d");

        Map<String,String> map1 = Map.of("son","토트넘","lee","파리","hong","국대");
        System.out.println(map1);

        //map1.replace("hong","감독");

        System.out.println("다음코드");
    }
}
