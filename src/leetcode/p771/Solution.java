package leetcode.p771;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // 보석의 종류를 저장할 Set
        Set<Character> jewelsSet = new HashSet<>();


        for (char s: jewels.toCharArray()){
            jewelsSet.add(s);
        }

        int count = 0;

        for (char j : stones.toCharArray()){
            if(jewelsSet.contains(j)){
                count++;
            }
        }
        return count;
    }
}
