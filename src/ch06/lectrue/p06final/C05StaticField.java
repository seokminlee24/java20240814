package ch06.lectrue.p06final;

public class C05StaticField {
    public static void main(String[] args) {
        //MyClass05.number = 9 //안됨
    }
}
class MyClass05{
    //final static : 변하지 않는 값(상수)로 사용
    // 변수명 작성 관습: UPPER_SNAKE_CASE
    final static int number = 5;
    final static  double pi = 3.141592;
    final  static int INTEGER_MAX_VALUE= 214;
}
