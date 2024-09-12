package ch17.lectrue.p03intermediate;

import java.util.Arrays;

public class C05Boxed {
    public static void main(String[] args) {
        //Steam IntStream, DoubleStream, LongStream

        //참조 타임원소 Stream 을 기본타입원소 Stream
        //mapToInd,mapToDouble,mapToLong

        //기본 타입 원소 Stream 을 참조 타임원소 Stream
        // : Boxed, mapToObj

        int[] nums = {100,1000,10,50,500};
        Arrays.stream(nums)
                .boxed()
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(nums)
                .mapToObj(n -> n + "원")
                .forEach(System.out::println);
    }
}
