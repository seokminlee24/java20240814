package ch15.sol.s09;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String maxName = null;
        int maxScore = 0;
        int totalScore = 0;

        //평균 점수, 최고 점수, 학생
        for (Map.Entry<String,Integer>entry : map.entrySet()){
            String name = entry.getKey();
            int score = entry.getValue();

            totalScore += score;

            if (maxScore < score){
                maxScore = score;
                maxName = name;
            }
        }
        double avg = totalScore/map.size();
        System.out.println("avg = " + avg);
        System.out.println("maxScore = " + maxScore);
        System.out.println("maxName = " + maxName);

    }
}
