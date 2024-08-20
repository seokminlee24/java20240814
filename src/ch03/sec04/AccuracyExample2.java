package ch03.sec04;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int  totalPieceUnit = apple * 10;
        int number = 7;

        int result =totalPieceUnit-number;
        System.out.println("사과 1개에서 남은양 = " + result);//3
        System.out.println("사과 1개에서 남은양 = " + result/10.0);//0.3


    }
}
