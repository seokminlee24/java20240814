package leetcode.p2206;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean divideArray(int[] nums) {
        int divide = 0;
        //배열을 전체 탐색해서
        //각 수가 몇개인지 저장(map)
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        //map을 전체 탐색해서 value가 홀 수인 것이 있으면
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            Integer value = entry.getValue();

            if (value % 2 != 0 ){
                return false;
            }
        }
        //return false;
        return true;
    }
}
