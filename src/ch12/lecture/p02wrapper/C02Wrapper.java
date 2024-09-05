package ch12.lecture.p02wrapper;

public class C02Wrapper {
    public static void main(String[] args) {
        Integer a = 5;

        //오래전....
        //직접 unboxing
        int b  = a.intValue();
        System.out.println(b);

        //현재
        //auto boxing
        int c = a;

        System.out.println(c);
    }
}
