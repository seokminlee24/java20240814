package ch07.lecture.p04cast;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();

        if(a instanceof  B){
            B b = (B) a;
            //B 메소드 실행
        }

//        if(a instanceof B b){
//            //B 메소드 실행
//        }

        if (a instanceof C){
            C c = (C) a;
        }
    }
}
