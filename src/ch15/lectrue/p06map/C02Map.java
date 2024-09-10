package ch15.lectrue.p06map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02Map {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("spring", 1000);
        map.put("react", 3000);
        map.put("java", 2000);
        map.put("vue", 1500);

        //전체 탐색
        //keySet 이용
        System.out.println("Keyset 이용");
        Set<String>Keys = map.keySet();
        for (String key : Keys){
            Integer val = map.get(key);
            System.out.println(key + ":" + val);
        }
        System.out.println();

        //entrySet 이용
        System.out.println("entry 이용");
        Set<Map.Entry<String,Integer>> entries =map.entrySet();
        for (Map.Entry<String,Integer> entry : entries){
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ":" + val);
        }
        System.out.println();

        //forEach 메소드
        System.out.println("forEach 이용");
        map.forEach((k,v)-> System.out.println(k + ":" + v));

    }
}
