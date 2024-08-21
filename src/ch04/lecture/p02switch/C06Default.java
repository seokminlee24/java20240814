package ch04.lecture.p02switch;

public class C06Default {
    public static void main(String[] args) {
        //1~10(정수), 고정적 방법
        int n = (int) (Math.random()*10)+1;
        System.out.println("n = " + n);

        switch (n){
            case 5:
            case 10:
                System.out.println("5의 배수");
                break;

            case 3:
            case 6:
            case 9:
                System.out.println("3의 배수");
                break;

            default:
                System.out.println("그외의 수");
                break;
        }
    }
}
