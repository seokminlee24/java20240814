package ch04.lecture.p01if;

public class C03ElseIf {
    public static void main(String[] args) {
        System.out.println(1);
        if(false){
            System.out.println(2);
            System.out.println(3);
        }else if(true){
            System.out.println(4);
            System.out.println(5);
        } else if (true) {
            System.out.println(6);
            System.out.println(7);
        }else { //마지막에 있어야한다
            System.out.println(8);
        }
        System.out.println(9);
    }
}
