package ch07.sol.s09;

public class S09 {
    public static void main(String[] args) {
      //  B b = new B();
//        B b = (B) new A(); // x
     //   B b = new D();
     //   B b = new E();

        method(new B());
//        method((B) new A()); // x
        method(new D());
        method(new E());
        System.out.println("다음 코드");
    }
        static void method(B b) {

    }
}

    class A{

    }

    class B extends A{

    }

    class D extends B{

    }

    class E extends B{

    }

    class C extends A{

    }

    class f extends C{

    }
