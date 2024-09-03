package ch16.lectrue.p02mthod_reference;

public class C04InstanceMethod {
    public static void main(String[] args) {
        //1.2.:파라미터 순서가 같을떄


        //3.특정 타입의 인스턴스 메소드
        //타입명::메소드
        //:첫번쨰 파라미터의 인스턴스 메소드 호출 시
        //두번쨰 파라미터가 샅은 순서로 사용되면.....
        MyInterface4 o = (a,b) -> a.action(b);
        MyInterface4 b = MyClass4::action;
    }
}

class MyClass4{
    void action(int a){
        System.out.println(a);
    }
}

interface MyInterface4{
    void some(MyClass4 o,int x);
}
