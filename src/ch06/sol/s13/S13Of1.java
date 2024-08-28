package ch06.sol.s13;

public class S13Of1 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setA(10);
        printer.setB(true);
        printer.setC(5.7);
        printer.setName("홍길동");

        System.out.println("printer.getA() = " + printer.getA());
        System.out.println("printer.getC() = " + printer.getC());
        System.out.println("printer.isB() = " + printer.isB());
        System.out.println("printer.getName() = " + printer.getName());
    }
}
