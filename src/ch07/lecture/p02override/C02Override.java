package ch07.lecture.p02override;

public class C02Override {
    public static void main(String[] args) {
    }
}
class  Parent02{
    public  void Method1(){
        System.out.println("Parent02.Method1");
    }

    public void method02(){
        System.out.println("Parent02.method02");
    }
}

class Child02 extends Parent02{
    //@Override : override annotation
    public void method1() {
    }

    @Override
    //단축기 : 상위 클래스 메소드명 일부 작성
    public void method02() {
        super.method02();
    }
}
