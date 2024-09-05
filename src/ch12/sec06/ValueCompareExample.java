package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {

        //-128~127 초과시
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("==1: " + (obj1 == obj2));//f
        System.out.println("equals1 = " + obj1.equals(obj2));//t
        System.out.println();

        //-128~127 범위값
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("==2: " + (obj3 == obj4)); //t
        System.out.println("equals2 = " + obj3.equals(obj4)); //t

    }
}
