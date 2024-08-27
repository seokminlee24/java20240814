package ch06.lectrue.p03method;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class C10Rturn {
    public static void main(String[] args) {
    }
}
class MyClass10{
    //return type : void , 또는 데이터 타입
    public void method1(){
        //void : return을 안해도됨
    }
    public int method2(){
        //void외 : return이 꼭 실행 하도록 코드를 작성해야함
        //return :
        //1. 메소드 종류
        //2. 오른쪽 값을 호출한 곳으로(return)
        // 오른쪽 값은 메소드의 리턴 타입과 타입이 완전히 일치해야함

        return 3;
    }
    public String method3(){
        return  "석민";
    }
    public int[] method4(){
        return new int[]{1,2,3,4,5};
    }
    public PrintStream method5() throws FileNotFoundException {
        return new PrintStream("");
    }

}
