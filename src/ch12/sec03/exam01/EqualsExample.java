package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("brue");
        Member obj2 = new Member("brue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)){
            System.out.println("obj1 과 obj2는 동등");
        }else {
            System.out.println("obj1 과 obj2는 동등하지 않는다.");
        }

        if (obj1.equals(obj3)){
            System.out.println("obj1 과 ob3는 동등");
        }else {
            System.out.println("obj1 과 obj3는 동등하지 않는다.");
        }
    }
}
