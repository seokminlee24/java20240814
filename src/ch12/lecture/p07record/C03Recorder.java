package ch12.lecture.p07record;

public class C03Recorder {
    public static void main(String[] args) {
        Book3 b1 = new Book3("java", 2000);
        b1.method1();

        System.out.println(b1 instanceof Object);
    }
}

// 보통의 클래스 처럼 사용가능
// equals, hashCode, toString 메소드는 이미 재정의 되어 있음
record Book3(
        String title,
        int price
) {
    public void method1() {
        System.out.println("Book3.method1");
    }
}