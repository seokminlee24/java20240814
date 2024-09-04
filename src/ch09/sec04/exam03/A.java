package ch09.sec04.exam03;

public class A {
    public void method1(int arg){
        int var =1;

        class B{
            void method2(){
                System.out.println("arg = " + arg);
                System.out.println("var = " + var); //수정 더이상 못함

                //arg =2;
                //val =2
            }
        }

        B b = new B();
        b.method2(); //값 수정 더이상 못함

        //arg = 3;
        //var = 2;
    }
}
