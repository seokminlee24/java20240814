package ch06.lectrue.p03method;

public class C07OverLoading {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        o1.Method1();
        o1.Method1(7);
        o1.Method1(7,8);
        o1.Method1(7,"리사수");
    }
}
class MyClass07{
    //Method Overloding :
    //파라미터 목록이 다른 같은 이름의 메소드를 작성할 수 있다.
    //파라미터 목록(갯수, 순서, 타입)
    public  void  Method1(){
        System.out.println("Method1 실행문");
    }
    public  void  Method1(int a){
        System.out.println("Method2 실행문");
    }
    public  void  Method1(int a,int b){
    }
    public  void  Method1(int a,String b){

    }
    public  void  Method1(String b,int a){

    }
}
