package ch2.sec2;

public class LongExample {
    public static void main(String[] args){
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 1_000_000_000_000; //에러남
        long var3 = 1_000_000_000_000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}
