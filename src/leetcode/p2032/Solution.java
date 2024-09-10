package leetcode.p2032;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int n : nums1){
            set1.add(n);
        }

        for (int n : nums2){
            set2.add(n);
        }

        for (int n : nums3){
            set3.add(n);
        }

        Set<Integer> result = new HashSet<>();

        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        result.addAll(temp);

        temp = new HashSet<>(set1);
        temp.retainAll(set3);
        result.addAll(temp);

        temp = new HashSet<>(set2);
        temp.retainAll(set3);
        result.addAll(temp);

        return new ArrayList<>(result);
    }
}
