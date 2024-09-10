package leetcode.p1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
           Integer v = map.getOrDefault(n,0);
           map.put(n, v + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value > 1){
                count += value*(value - 1)/2;
            }

        }
        return count;
    }
}
