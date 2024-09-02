package ch08.lectrue.p03cast;

public class C02Cast {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        if(o instanceof MyClass21){
            MyClass21 a = (MyClass21) o;
        }

        if (o instanceof MyClass22){
            MyClass22 b = (MyClass22) o;
        }
        System.out.println("다음코드");
    }
}

//@formatter:off
interface  MyInterface2{ }
class MyClass21 implements MyInterface2{}
class MyClass22 implements MyInterface2{}

