package ch07.lecture.p02override;

public class C01Override {
    public static void main(String[] args) {
        Sub01 sub01 = new Sub01();
        sub01.method1();
        sub01.method2();
    }
}
class  Super01{
    public void method1(){
        System.out.println("Super01.method1");
    }
}

class Sub01 extends Super01{
    //method1(존재함)
    // 상속받은 메소드 덮어쓰기 가능(재정의, override) 가능
    public void method1(){
        System.out.println("Sub01.method1");
    }
    public void method2() {
        System.out.println("Sub01.method2");
    }
}
