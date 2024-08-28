package ch06.lectrue.p05static;

public class C05StaticBlock {
    public static void main(String[] args) {
    }
}
class MyClass05{
    static  int number;
    int age;

    static {
        //static field 초기화
        boolean a =true;
        if (a){
            number = 10;
        }else{
            number = 100;
        }
    }
        MyClass05() {
            // 인스턴스 필드 초기화
            age = 5;
        }
}
