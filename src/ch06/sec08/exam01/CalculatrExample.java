package ch06.sec08.exam01;

public class CalculatrExample {
    public static void main(String[] args) {
        //Calculatr 객체 생성
        Calculatr myCalc = new Calculatr();

        //리턴값이 없는 powerOn() 메소드 호출
        myCalc.powerOn();

        //plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
        //덧셉 결과를 리턴받아 result1 변수에 대입
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 = " + result1);
        int x = 10;
        int y = 4;
        //divide() 메소드 호출 시 변수 x와 ㅛ의 값을 매개값으로 제공하고,
        //나누셈 결과를 리턴받아 result2 변수에 대입
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);
        //리턴값이 없는, powerOff()메소드 호출
        myCalc.powerOff();;
    }
}
