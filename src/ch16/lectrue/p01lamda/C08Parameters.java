package ch16.lectrue.p01lamda;

public class C08Parameters {
    public static void main(String[] args) {
        MyInterface8 o = (int x, int y, int z) -> System.out.println("셋");
        o.some(2,3,4);

        //파라미터 목록의 타입 생갹 가능(선호)
        MyInterface8 p = (x, y, z) -> System.out.println("타입생략");
        o.some(4,5,6);

        MyInterface8 c = (int a , int qwer, int asdf) -> {
            System.out.println(a);
            System.out.println(qwer);
            System.out.println(asdf);
        };
        c.some(10,20,30);

        MyInterface8 d = (q , w , e) -> System.out.println(q+w+e);
        d.some(99,88,77);
    }
}

interface MyInterface8{
    void some(int x, int y, int z);

}
