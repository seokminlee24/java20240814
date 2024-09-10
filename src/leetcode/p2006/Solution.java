package leetcode.p2006;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // 배열을 순회하며 각 숫자의 빈도 계산
        for (int num : nums) {
            // 현재 숫자 num과 num + k 쌍의 개수
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            // 현재 숫자 num과 num - k 쌍의 개수
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }

            // 현재 숫자의 빈도 증가
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // keySet을 사용하여 키를 순회
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        return count;
    }
}
