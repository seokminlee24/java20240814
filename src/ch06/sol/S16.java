package ch06.sol;

public class S16 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(5.7);
        printer.println("홍길동");
        printer.println(true);
    }
}
class Printer{

    public void println(int i) {
        System.out.println(i);
    }

    public void println(double i) {
        System.out.println("i = " + i);
    }

    public void println(String i) {
        System.out.println("i = " + i);
    }

    public void println(boolean i) {
        System.out.println("i = " + i);
    }
}

