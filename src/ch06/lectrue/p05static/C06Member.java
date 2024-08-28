package ch06.lectrue.p05static;

public class C06Member {
    public static void main(String[] args) {
    }
}
//member: field,method,(생성자)

//static member에서 instance에 접속 불가
//instance member에서 static member에 접속 가능
class MyClass06{
    static  int number ;
    int age;

    static void method(){
        System.out.println(number);
        //System.out.println(age);
    }

    void  method2(){
        System.out.println(number);
        System.out.println(age);
    }
}