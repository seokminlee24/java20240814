package ch06.lectrue.p03method;

public class C05Paramter {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        a.method2(5);
        a.method2(10);
        a.method2(99);
        int b = 0;
        a.method2(b);
        System.out.println();
        a.method3(25,"이석민");
        a.method3(33,"손흥민");
    }
}
class  MyClass05{
    //(): 파라미터(parameter, 인자, 매개변수)목록
    //argument(인수)
    //타입 파라미터명, 타입 파라미터명,.....
    public void  method1(int age,String myName,int[]score,String[] studerntName) {
        //변수 선언, 값, 값 대입,제어문,연산식
    }
    public void  method2(int age){
        System.out.println("실행할 코드들");
        System.out.println("age = " + age);
    }
    public  void  method3(int age, String name){
        System.out.println(STR."\{age}세,\{name}");
    }
}
