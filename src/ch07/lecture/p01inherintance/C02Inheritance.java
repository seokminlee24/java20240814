package ch07.lecture.p01inherintance;

public class C02Inheritance {
    public static void main(String[] args) {
    }
}

class ParentClass02{
    private  String name;
    private int age;

    public ParentClass02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //메소드....
}

class  ChildClass02 extends ParentClass02{
    ChildClass02(String name, int age){
        //부모클래스 필드에 접근할 수 없기 떄문에
        //this name = a;
        //this.age= 10;

        //자식 클래스 생성자에서
        //꼭 부모클래스 생성자를 호출
        //필드 초기화를 해야한다.
        super(name, age);

    }


    void  method(){
        //private 필드 접근 불가
        //this name = a;
        //this.age= 10;
    }
}
