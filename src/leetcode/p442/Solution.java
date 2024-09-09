package leetcode.p442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplication = new ArrayList<>();
        for (int n : nums){
            boolean b = set.add(n);
            if (!b){
                duplication.add(n);
            }
        }
        return duplication;
    }

}
