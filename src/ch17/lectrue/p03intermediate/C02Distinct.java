package ch17.lectrue.p03intermediate;

import java.util.List;

public class C02Distinct {
    public static void main(String[] args) {
        //distinct : 중복제거
        List<Integer> list = List.of(3,1,4,1,5,9,2);
        long count1 = list.stream()
                .distinct()
                .count();

        System.out.println("count1 = " + count1);
    }
}
