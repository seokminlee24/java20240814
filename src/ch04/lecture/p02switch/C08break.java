package ch04.lecture.p02switch;

public class C08break {
    public static void main(String[] args) {
        //고전적인 방법 1,2,3
        int n = (int) (Math.random()*3)+1;
        switch (n) {
            case 1 :
                System.out.println("첫번쨰");
            case 2 :
                System.out.println("두번쨰");
                break;
            case 3 :
                System.out.println("3번쨰");
                break; //생략가능
        }
    }
}
