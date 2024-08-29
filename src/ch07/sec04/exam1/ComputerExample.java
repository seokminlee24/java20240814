package ch07.sec04.exam1;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 = " + calculator.araeaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 = " + computer.araeaCircle(r));
        System.out.println();
    }
}
