package ch03.sec03;

public class OverflowUnderflowExmple {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i <5 ; i++) { //5번까지 반복
            var1++; //var1 값 1식 증가
            System.out.println("var1 = " + var1);
            /*
            var1 = 126
            var1 = 127
            var1 = -128
            var1 = -127
            var1 = -126
            */
        }
        byte var2 = -125;
        for (int i = 0; i <5 ; i++) { //5번까지 반복
            var2--; //var1 값 1식 감소
            System.out.println("var2= " + var2);
            /*
            var2= -126
            var2= -127
            var2= -128
            var2= 127
            var2= 126
            */
        }
    }
}
