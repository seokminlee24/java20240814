package leetcode.p2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1){
            set1.add(n);
        }

        for (int n : nums2){
            set2.add(n);
        }

        Set<Integer> deff1 = new HashSet<>(set1);
        deff1.removeAll(set2);
        Set<Integer> deff2 = new HashSet<>(set2);
        deff2.removeAll(set1);

        List<Integer> list1 = new ArrayList<>(deff1);
        List<Integer> list2 = new ArrayList<>(deff2);

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }

}
