package leetcode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        Set<Character> wordsSet = new HashSet<>();

        for (char j : allowed.toCharArray()){
            allowedSet.add(j);
        }

        int count = 0;

        for (String word:words){
            boolean isConsistent = true;

            for (char c : word.toCharArray()){
                if (!allowedSet.contains(c)){
                    isConsistent = false;
                    break;
                }
            }

            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}