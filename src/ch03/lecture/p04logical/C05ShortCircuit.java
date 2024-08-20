package ch03.lecture.p04logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println((a++) > 0 || (b++) < 0);//ture

        System.out.println("a = " + a); //6
        System.out.println("b = " + b); //5

        int c = 5;
        int d = 5;
        System.out.println((c++) > 0 | (d++) < 0); //true
        System.out.println("c = " + c); //6
        System.out.println("d = " + d); //6
    }
}
