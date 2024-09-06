package ch13.sec04;

public class GenericExample {
    public static <T extends Number> boolean compare(T t1, T t2) {

        System.out.println("t1 = " + t1.getClass().getSimpleName());
        System.out.println("t2 = " + t2.getClass().getSimpleName());

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return v1 == v2;
    }

    public static void main(String[] args) {
        boolean r1 = compare(10, 20);
        System.out.println("r1 = " + r1);
        System.out.println();

        boolean r2 = compare(3.14, 3.14);
        System.out.println("r2 = " + r2);
        System.out.println();

        boolean r3 = compare(3L, 3L);
        System.out.println("r3 = " + r3);

    }
}
