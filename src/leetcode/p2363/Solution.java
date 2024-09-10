package leetcode.p2363;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int[] item1 : items1){
            int value = item1[0];
            int weight = item1[1];
            map.put(value,map.getOrDefault(value,0) + weight);
        }

        for (int[] item2 : items2){
            int value = item2[0];
            int weight = item2[1];
            map.put(value,map.getOrDefault(value,0) + weight);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        result.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        return result;
    }
}
